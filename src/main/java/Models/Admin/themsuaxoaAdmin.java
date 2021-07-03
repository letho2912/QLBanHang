package Models.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Models.Sites.productModel;
import Connect.QLBanHangConnect;

public class themsuaxoaAdmin {
	Connection conn = null;
	NumberFormat currentLocale = NumberFormat.getInstance();
	Locale localeEN = new Locale("en", "EN");
	NumberFormat en = NumberFormat.getInstance(localeEN);

	public List<productModel> listProduct() throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();

		String sql = "select * from Product";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<productModel>();
		while (rs.next()) {
			productModel product = new productModel();
			String product_id = rs.getString("Product_id");
			product.setProduct_id(product_id);
			product.setName_product(rs.getString("nameProduct"));
			String describe = rs.getString("describe").substring(0,85);
			product.setDescribe(describe);
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			product.setAmount(rs.getInt("amount"));
			product.setColor(rs.getString("color"));
			product.setSize(rs.getString("size"));
			product.setImg(rs.getString("img"));
			product.setProducer(rs.getString("producer"));
			product.setStatus(rs.getInt("status"));
			product.setSale(sale);
			product.setPrice(price);
			product.setStr1(str1);
			product.setStr2(str2);

			list.add(product);
		}
		return list;

	}

	public static void insertProduct(Connection conn, productModel product) throws SQLException {

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

	public static productModel findProduct(Connection conn, String product_id) throws SQLException {

		String sql = "select Product_id,nameProduct,describe,price,amount,sale,color,size,img,producer,status,Category_id,prCategory_id from Product where Product_id=?";
		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, product_id);
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {
			String Product_id = rs.getString("Product_id");
			String nameProduct = rs.getString("nameProduct");
			String describe = rs.getString("describe");
			int price = rs.getInt("price");
			int amount = rs.getInt("amount");
			int sale = rs.getInt("sale");
			String color = rs.getString("color");
			String size = rs.getString("size");
			String img = rs.getString("img");
			String producer = rs.getString("producer");
			int status = rs.getInt("status");
			String category_id = rs.getString("Category_id");
			String prCategory_id = rs.getString("prCategory_id");
			productModel product = new productModel();
			product.setProduct_id(Product_id);
			product.setName_product(nameProduct);
			product.setDescribe(describe);
			product.setPrice(price);
			product.setAmount(amount);
			product.setSale(sale);
			product.setColor(color);
			product.setSize(size);
			product.setImg(img);
			product.setProducer(producer);
			product.setStatus(status);
			product.setCategory_id(category_id);
			product.setPrCategory_id(prCategory_id);

			return product;
		}
		return null;

	}

	public static void updateProduct(Connection conn, productModel product, String product_id) throws SQLException {

		String sql = "Update Product set nameProduct=?,describe=?, price=?,amount=?,sale=?,color=?,size=?,img=?,producer=?,status=?,Category_id=?,prCategory_id=? where Product_id =? ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, product.getName_product());
		pstm.setString(2, product.getDescribe());
		pstm.setInt(3, product.getPrice());
		pstm.setInt(4, product.getAmount());
		pstm.setInt(5, product.getSale());
		pstm.setString(6, product.getColor());
		pstm.setString(7, product.getSize());
		pstm.setString(8, product.getImg());
		pstm.setString(9, product.getProducer());
		pstm.setInt(10, product.getStatus());
		pstm.setString(11, product.getCategory_id());
		pstm.setString(12, product.getPrCategory_id());
		pstm.setString(13, product.getProduct_id());

		pstm.executeUpdate();
	}

	public static void deleteProduct(Connection conn, String product_id) throws SQLException {
		String sql = "Delete from Product where Product_id= ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, product_id);
		pstm.executeUpdate();
	}
	/*public List<productModel> listProductPagi(int offset,int limit) throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();

		String sql = "select * from Product order by id offset ? ROWS fetch first ? Rows only";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, offset);
		ps.setInt(2, limit);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<productModel>();
		while (rs.next()) {
			productModel product = new productModel();
			String product_id = rs.getString("Product_id");
			product.setProduct_id(product_id);
			product.setName_product(rs.getString("nameProduct"));
			String describe = rs.getString("describe").substring(0, 120);
			product.setDescribe(describe);
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			product.setId(rs.getInt("id"));
			product.setAmount(rs.getInt("amount"));
			product.setColor(rs.getString("color"));
			product.setSize(rs.getString("size"));
			product.setImg(rs.getString("img"));
			product.setProducer(rs.getString("producer"));
			product.setStatus(rs.getInt("status"));
			product.setSale(sale);
			product.setPrice(price);
			product.setStr1(str1);
			product.setStr2(str2);

			list.add(product);
		}
		return list;

	}

	public int count() {
		new QLBanHangConnect();
		Connection conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select count(Product_id) from Product";
		int count = 0;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;

	}*/
	public List<productModel> querySearchProduct(String product_id) throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select * from Product where Product_id like '%" + product_id + "%'";
		PreparedStatement ps = conn.prepareStatement(sql);
		// ps.setString(1, nameProduct);
		// ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<>();
		while (rs.next()) {
			@SuppressWarnings("unused")
			NumberFormat currentLocale = NumberFormat.getInstance();
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);

			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			String img = rs.getString("img");
			productModel prModel = new productModel();
			prModel.setName_product(rs.getString("nameProduct"));
			prModel.setStr1(str1);
			prModel.setStr2(str2);
			prModel.setImg(img);
			prModel.setAmount(rs.getInt("amount"));
			prModel.setColor(rs.getString("color"));
			prModel.setDescribe(rs.getString("describe").substring(0,100));
			prModel.setProducer(rs.getString("producer"));
			prModel.setProduct_id(rs.getString("Product_id"));
			prModel.setSize(rs.getString("size"));
			prModel.setSale(sale);

			list.add(prModel);
		}
		return list;
	}


}
