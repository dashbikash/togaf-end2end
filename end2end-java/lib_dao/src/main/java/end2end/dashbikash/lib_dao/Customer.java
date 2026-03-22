package end2end.dashbikash.lib_dao;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    @Column(name = "company_name", length = 100, nullable = false)
    private String companyName;

    @Column(name = "business_type", length = 30, nullable = false)
    private String businessType;

    @Column(name = "tax_identifier", length = 50, unique = true)
    private String taxIdentifier;

    @Column(name = "credit_limit", precision = 15, scale = 2, nullable = false)
    private BigDecimal creditLimit = BigDecimal.ZERO;

    @Column(name = "current_balance", precision = 15, scale = 2, nullable = false)
    private BigDecimal currentBalance = BigDecimal.ZERO;

    @Column(name = "account_status", nullable = false)
    private String accountStatus;

    @Column(name = "contact_number")
    private String contactNumber;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getTaxIdentifier() {
		return taxIdentifier;
	}

	public void setTaxIdentifier(String taxIdentifier) {
		this.taxIdentifier = taxIdentifier;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
}