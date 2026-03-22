# Data Architecture

## 

## Business Customers Schema




| **Column Name**      | **Data Type**   | **Constraints**        | **Description**                             |
| -------------------- | --------------- | ---------------------- | ------------------------------------------- |
| `business_id`        | `UUID`          | `PRIMARY KEY`          | Unique identifier (e.g., `BUS-5001`).       |
| `company_name`       | `VARCHAR(100)`  | `NOT NULL`, `INDEX`    | Legal entity name.                          |
| `business_type`      | `VARCHAR(30)`   | `NOT NULL`             | (e.g., Wholesaler, Retailer, Distributor).  |
| `tax_identifier`     | `VARCHAR(50)`   | `UNIQUE`               | GSTIN, VAT, or Tax ID.                      |
| `credit_limit`       | `DECIMAL(15,2)` | `DEFAULT 0.00`         | Max credit allowed for post-paid orders.    |
| `current_balance`    | `DECIMAL(15,2)` | `DEFAULT 0.00`         | Current outstanding amount.                 |
| `account_status`     | `ENUM`          | `Active, Hold, Review` | State machine for order fulfillment.        |
| `primary_contact_id` | `UUID`          | `FOREIGN KEY`          | Links to a `Contacts` table for the person. |

## Product Schema

| **Column Name**        | **Data Type**   | **Constraints**                           | **Description**                                   |
| ---------------------- | --------------- | ----------------------------------------- | ------------------------------------------------- |
| **`sku_id`**           | `VARCHAR(50)`   | `PRIMARY KEY`                             | Unique Stock Keeping Unit (e.g., `GRN-RIC-101`).  |
| **`product_name`**     | `VARCHAR(150)`  | `NOT NULL`, `INDEX`                       | Consumer-facing name of the product.              |
| **`category`**         | `ENUM`          | `'Grains', 'Oils'`                        | Top-level inventory classification.               |
| **`sub_category`**     | `VARCHAR(50)`   | `INDEX`                                   | Fine-grained type (e.g., 'Basmati', 'Sunflower'). |
| **`extraction_grade`** | `VARCHAR(50)`   | `NULL`                                    | Quality tier (e.g., 'Cold Pressed', 'A1 Grade').  |
| **`uom`**              | `ENUM`          | `'KG', 'L', 'ML', 'G'`                    | Unit of Measure for the `pack_size`.              |
| **`pack_size_value`**  | `DECIMAL(10,2)` | `NOT NULL`                                | Numeric quantity (e.g., 5.00, 1.00).              |
| **`packaging_type`**   | `ENUM`          | `'Pouch', 'Bottle', 'Tin', 'Sack', 'Jar'` | Physical container type for logistics.            |
| **`unit_price`**       | `DECIMAL(12,2)` | `NOT NULL`                                | Base price per individual pack/unit.              |
| **`stock_quantity`**   | `DECIMAL(15,3)` | `DEFAULT 0.000`                           | Current available inventory count.                |
| **`origin_region`**    | `VARCHAR(100)`  | `NULL`                                    | Sourcing location (e.g., 'Haryana', 'Ukraine').   |
| **`expiry_date`**      | `DATE`          | `NOT NULL`, `INDEX`                       | Critical for FIFO (First-In, First-Out) logic.    |
| **`is_organic`**       | `BOOLEAN`       | `DEFAULT FALSE`                           | Flag for specialized health-food segments.        |
