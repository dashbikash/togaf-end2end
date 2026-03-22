use customer_db;
INSERT INTO customers (
    id, company_name, business_type, tax_identifier, 
    credit_limit, current_balance, account_status, contact_number
) VALUES 
('BUS-IN-101', 'Reliance Retail Ltd', 'Hypermarket', 'GST-IN-27AAACR', 1000000.00, 150000.00, 'Active', '+91-22-6767-1000'),
('BUS-US-202', 'Whole Foods Market', 'Supermarket', 'EIN-US-123456', 500000.00, 0.00, 'Active', '+1-512-477-4455'),
('BUS-IN-303', 'Adani Wilmar Ltd', 'Distributor', 'GST-IN-24AAACA', 2500000.00, 1200000.00, 'Active', '+91-79-2645-5650'),
('BUS-UK-404', 'Tesco PLC', 'Retail Chain', 'VAT-UK-987654', 750000.00, 750000.00, 'Hold', '+44-1992-632222'),
('BUS-IN-505', 'BigBasket B2B', 'E-commerce', 'GST-IN-29AAACB', 150000.00, 45000.00, 'Active', '+91-80-3301-3001'),
('BUS-AE-606', 'Lulu Group International', 'Hypermarket', 'TRN-AE-100200', 1200000.00, 300000.00, 'Active', '+971-2-418-0000'),
('BUS-IN-707', 'Mother Dairy Foods', 'Processor', 'GST-IN-07AAACM', 80000.00, 78000.00, 'Review', '+91-120-284-1601'),
('BUS-SG-808', 'FairPrice Group', 'Wholesaler', 'UEN-SG-197300', 300000.00, 150.75, 'Active', '+65-6456-0232'),
('BUS-IN-909', 'ITC Limited', 'Manufacturer', 'GST-IN-19AAACI', 5000000.00, 0.00, 'Active', '+91-33-2288-9371'),
('BUS-AU-010', 'Woolworths Group', 'Retail Chain', 'ABN-AU-88000', 950000.00, 20000.00, 'Active', '+61-2-8885-0000');