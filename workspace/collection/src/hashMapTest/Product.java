package hashMapTest;

public class Product {
//   ��ǰ ��ȣ, ��ǰ �̸�, ��ǰ ����, ��ǰ ���
   private static Long sequence;
   private Long productId;
   private String productName;
   private int productPrice;
   private int productStock;

//   static ��� : �� �� ���� ����
   static {
      sequence = 0L;
   }
   
//   �ʱ�ȭ ���: �����ڸ� ȣ���� �� ���� ����
   {
      sequence++;
   }
   
   public Product() {;}
   
   public Product(String productName, int productPrice, int productStock) {
      this.productId = sequence;
      this.productName = productName;
      this.productPrice = productPrice;
      this.productStock = productStock;
   }

   public Long getProductId() {
      return productId;
   }

   public void setProductId(Long productId) {
      this.productId = productId;
   }

   public String getProductName() {
      return productName;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public int getProductPrice() {
      return productPrice;
   }

   public void setProductPrice(int productPrice) {
      this.productPrice = productPrice;
   }

   public int getProductStock() {
      return productStock;
   }

   public void setProductStock(int productStock) {
      this.productStock = productStock;
   }

   @Override
   public String toString() {
      return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
            + ", productStock=" + productStock + "]";
   }
}
