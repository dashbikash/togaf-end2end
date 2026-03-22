package end2end.dashbikash.lib_dao;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")

public class Product {

    @Id
    @Column(name = "id", length = 50)
    private String id;

    @Column(name = "product_name", length = 150, nullable = false)
    private String productName;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "sub_category", length = 50)
    private String subCategory;

    @Column(name = "extraction_grade", length = 50)
    private String extractionGrade;

    @Column(name = "uom", nullable = false)
    private String uom;

    @Column(name = "pack_size_value", precision = 10, scale = 2, nullable = false)
    private BigDecimal packSizeValue;

    @Column(name = "packaging_type")
    private String packagingType;

    @Column(name = "unit_price", precision = 12, scale = 2, nullable = false)
    private BigDecimal unitPrice;

    @Column(name = "stock_quantity", precision = 15, scale = 3, nullable = false)
    private BigDecimal stockQuantity;
    
    @Column(name = "origin_region", length = 100)
    private String originRegion;

    @Column(name = "expiry_date", nullable = false)
    private LocalDate expiryDate;

    @Column(name = "is_organic")
    private Boolean isOrganic;
    
    
    public Product() {
		super();
	}

	public Product(String id, String productName, String category, String subCategory, String extractionGrade,
			String uom, BigDecimal packSizeValue, String packagingType, BigDecimal unitPrice, BigDecimal stockQuantity,
			String originRegion, LocalDate expiryDate, boolean isOrganic) {
		super();
		this.id = id;
		this.productName = productName;
		this.category = category;
		this.subCategory = subCategory;
		this.extractionGrade = extractionGrade;
		this.uom = uom;
		this.packSizeValue = packSizeValue;
		this.packagingType = packagingType;
		this.unitPrice = unitPrice;
		this.stockQuantity = stockQuantity;
		this.originRegion = originRegion;
		this.expiryDate = expiryDate;
		this.isOrganic = isOrganic;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getExtractionGrade() {
		return extractionGrade;
	}

	public void setExtractionGrade(String extractionGrade) {
		this.extractionGrade = extractionGrade;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public BigDecimal getPackSizeValue() {
		return packSizeValue;
	}

	public void setPackSizeValue(BigDecimal packSizeValue) {
		this.packSizeValue = packSizeValue;
	}

	public String getPackagingType() {
		return packagingType;
	}

	public void setPackagingType(String packagingType) {
		this.packagingType = packagingType;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(BigDecimal stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public String getOriginRegion() {
		return originRegion;
	}

	public void setOriginRegion(String originRegion) {
		this.originRegion = originRegion;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Boolean isOrganic() {
		return isOrganic;
	}

	public void setOrganic(boolean isOrganic) {
		this.isOrganic = isOrganic;
	}

	@PrePersist
	private void setDefaults() {
	    if (this.isOrganic == null) {
	        isOrganic = false;  // Set default value
	    }
	}
	

 }