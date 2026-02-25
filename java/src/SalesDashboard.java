import java.util.Scanner;

class SalesDashboard {
   SalesDashboard() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the number of products to record: ");
      int var2 = var1.nextInt();
      var1.nextLine();
      String[] var3 = new String[var2];
      int[] var4 = new int[var2];
      double[] var5 = new double[var2];
      double[] var6 = new double[var2];
      double[] var7 = new double[var2];
      double[] var8 = new double[var2];
      String[] var9 = new String[var2];
      double var10 = 0.0;
      int var12 = 0;
      int var13 = 0;

      for(int var14 = 0; var14 < var2; ++var14) {
         System.out.println("\n--- Product " + (var14 + 1) + " ---");
         System.out.print("Product Name: ");
         var3[var14] = var1.nextLine();
         System.out.print("Quantity Sold: ");
         var4[var14] = var1.nextInt();
         System.out.print("Price per Unit: ");
         var5[var14] = var1.nextDouble();
         var1.nextLine();
         var6[var14] = (double)var4[var14] * var5[var14];
         if (var6[var14] > 10000.0) {
            var7[var14] = var6[var14] * 0.1;
         } else if (var6[var14] > 5000.0) {
            var7[var14] = var6[var14] * 0.05;
         } else {
            var7[var14] = 0.0;
         }

         var8[var14] = var6[var14] - var7[var14];
         if (var6[var14] >= 15000.0) {
            var9[var14] = "Excellent";
         } else if (var6[var14] >= 8000.0) {
            var9[var14] = "Good";
         } else {
            var9[var14] = "Average";
         }

         var10 += var8[var14];
         if (var6[var14] > var6[var12]) {
            var12 = var14;
         }

         if (var6[var14] < var6[var13]) {
            var13 = var14;
         }
      }

      double var17 = var10 / (double)var2;
      System.out.println("\nðŸ“Š SALES DASHBOARD REPORT");
      System.out.println("---------------------------------------------------------------------------------");
      System.out.printf("%-15s %-5s %-10s %-10s %-10s %-10s %-10s\n", "Product", "Qty", "Price", "Total", "Discount", "NetSales", "Grade");
      System.out.println("---------------------------------------------------------------------------------");

      for(int var16 = 0; var16 < var2; ++var16) {
         System.out.printf("%-15s %-5d %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n", var3[var16], var4[var16], var5[var16], var6[var16], var7[var16], var8[var16], var9[var16]);
      }

      System.out.println("---------------------------------------------------------------------------------");
      System.out.printf("Overall Revenue : â‚¹%.2f\n", var10);
      System.out.printf("Average Sales   : â‚¹%.2f\n", var17);
      System.out.println("Highest Sales   : " + var3[var12] + " (â‚¹" + var6[var12] + ")");
      System.out.println("Lowest Sales    : " + var3[var13] + " (â‚¹" + var6[var13] + ")");
      var1.close();
   }
}
