# dev-week-23

## Diagrama de Classes

```mermaid

classDiagram
    class <link>Car</link> {
        - car: String
        - information: <link>Information</link>
    }
    
    class <link>Information</link> {
        - model: String
        - color: String
        - rental_price: Float
    }
    
    class <link>CustomerBase</link> {
        - name: String
        - cpf: String
        - address: String
        - contact_number: String
    }
    
    class <link>RentalStatus</link> {
        - initial_date: String
        - final_date: String
    }
    
    <link>Car</link> --> <link>Information</link>
    <link>Car</link> --> <link>CustomerBase</link>
    <link>Car</link> --> <link>RentalStatus</link>
```
