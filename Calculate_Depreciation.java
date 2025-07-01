// Calculate Depreciation of Value


public class Calculate_Depreciation {
    public static void main(String[] args) {
        int cost_of_product = 10000;   // cost of product is 10,000
        int cost_of_salvage_value = 1000; // cost of salvage vale
        int life_of_product = 5;  // life of a product
        int CalculateDepreciation;


        CalculateDepreciation = (cost_of_product - cost_of_salvage_value) / life_of_product;
        System.out.println("The Depreciation value of your product is :" + CalculateDepreciation);


    }

}
