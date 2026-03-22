INSERT INTO products (
    id, product_name, category, sub_category, extraction_grade, 
    uom, pack_size_value, packaging_type, unit_price, 
    stock_quantity, origin_region, expiry_date, is_organic
) VALUES 
-- GRAINS SECTION
('GRN-RIC-001', 'Premium Basmati Rice', 'Grains', 'Rice', 'Export Grade', 'KG', 5.00, 'Sack', 12.50, 450.000, 'Haryana', '2027-06-15', false),
('GRN-WHT-002', 'Chakki Fresh Atta', 'Grains', 'Wheat', 'Whole Grain', 'KG', 10.00, 'Sack', 8.20, 1200.000, 'Punjab', '2026-12-20', false),
('GRN-MIL-003', 'Organic Finger Millet', 'Grains', 'Millet', 'A Grade', 'KG', 1.00, 'Pouch', 3.45, 250.000, 'Karnataka', '2027-01-10', true),
('GRN-QUI-004', 'White Quinoa', 'Grains', 'Pseudocereal', 'Premium', 'G', 500.00, 'Jar', 7.99, 120.000, 'Peru', '2027-05-30', true),
('GRN-BAR-005', 'Pearled Barley', 'Grains', 'Barley', 'Standard', 'KG', 1.00, 'Pouch', 2.15, 300.000, 'Australia', '2026-11-15', false),
('GRN-OAT-006', 'Steel Cut Oats', 'Grains', 'Oats', 'Organic', 'G', 800.00, 'Tin', 6.50, 180.000, 'Canada', '2026-10-05', true),
('GRN-RIC-007', 'Sona Masoori Rice', 'Grains', 'Rice', 'Medium Grain', 'KG', 25.00, 'Sack', 45.00, 50.000, 'Andhra Pradesh', '2027-08-12', false),
('GRN-COR-008', 'Yellow Corn Grits', 'Grains', 'Corn', 'Coarse', 'KG', 2.00, 'Pouch', 4.10, 400.000, 'Iowa_USA', '2026-09-18', false),
('GRN-RYE-009', 'Dark Rye Grain', 'Grains', 'Rye', 'Whole', 'KG', 1.00, 'Pouch', 3.75, 150.000, 'Germany', '2027-02-22', true),
('GRN-MIL-010', 'Pearl Millet (Bajra)', 'Grains', 'Millet', 'Natural', 'KG', 5.00, 'Sack', 6.80, 600.000, 'Rajasthan', '2026-11-30', false),

-- OILS SECTION
('OIL-SUN-011', 'Refined Sunflower Oil', 'Oils', 'Sunflower', 'Triple Refined', 'L', 1.00, 'Pouch', 2.10, 2000.000, 'Ukraine', '2027-01-05', false),
('OIL-OLV-012', 'Extra Virgin Olive Oil', 'Oils', 'Olive', 'Cold Pressed', 'ML', 500.00, 'Bottle', 12.50, 350.000, 'Spain', '2027-04-20', true),
('OIL-MUS-013', 'Kachi Ghani Mustard Oil', 'Oils', 'Mustard', 'Cold Pressed', 'L', 1.00, 'Bottle', 3.20, 800.000, 'Rajasthan', '2027-03-15', false),
('OIL-COC-014', 'Virgin Coconut Oil', 'Oils', 'Coconut', 'Raw Unrefined', 'ML', 250.00, 'Jar', 5.40, 420.000, 'Kerala', '2027-06-10', true),
('OIL-GRO-015', 'Groundnut Oil', 'Oils', 'Peanut', 'Refined', 'L', 5.00, 'Tin', 18.00, 150.000, 'Gujarat', '2027-02-28', false),
('OIL-SES-016', 'Toasted Sesame Oil', 'Oils', 'Sesame', 'Premium', 'ML', 200.00, 'Bottle', 4.95, 200.000, 'Japan', '2027-07-15', false),
('OIL-CAN-017', 'Canola Cooking Oil', 'Oils', 'Canola', 'Low Erucic', 'L', 2.00, 'Bottle', 5.80, 550.000, 'Canada', '2027-01-25', false),
('OIL-AVO-018', 'Avocado Oil', 'Oils', 'Avocado', 'Pure', 'ML', 250.00, 'Bottle', 14.00, 85.000, 'Mexico', '2027-05-12', true),
('OIL-PLM-019', 'Vegetable Palm Oil', 'Oils', 'Palm', 'Refined', 'L', 15.00, 'Tin', 24.50, 300.000, 'Malaysia', '2026-12-10', false),
('OIL-FLX-020', 'Flaxseed Oil', 'Oils', 'Flax', 'Cold Pressed', 'ML', 250.00, 'Bottle', 9.20, 110.000, 'Montana_USA', '2026-10-30', true);