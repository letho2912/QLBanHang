package Models.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Connect.QLBanHangConnect;
import Models.Sites.productModel;

public class addProduct {
	public static void insertProduct(Connection conn,productModel product) throws SQLException {
		
        String sql = "Insert into Product(Product_id ,nameProduct ,describe ,price ,amount ,sale,color ,size ,img ,producer ,status ,Category_id ,prCategory_id)  values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, product.getProduct_id());
        pstm.setString(2, product.getName_product());
        pstm.setString(3, product.getDescribe());
        pstm.setInt(4, product.getPrice());
        pstm.setInt(5, product.getAmount());
        pstm.setInt(6, product.getSale());
        pstm.setString(7, product.getColor());
        pstm.setString(8, product.getSize());
        pstm.setString(9, product.getImg());
        pstm.setString(10, product.getProducer());
        pstm.setInt(11, product.getStatus());
        pstm.setString(12, product.getCategory_id());
        pstm.setString(13, product.getPrCategory_id());

        pstm.executeUpdate();
    }
}
