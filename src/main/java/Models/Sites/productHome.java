package Models.Sites;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Connect.QLBanHangConnect;

public class productHome {
	Connection conn = null;

	public List<productModel> queryProduct() throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select top 6 nameProduct, price, sale, img,Product_id from Product where sale>0 order by newid()";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<>();
		while (rs.next()) {
			@SuppressWarnings("unused")
			NumberFormat currentLocale = NumberFormat.getInstance();
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);

			String name_Product = rs.getString("nameProduct");
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			String img = rs.getString("img");
			productModel prModel = new productModel();
			prModel.setName_product(name_Product);
			prModel.setSale(sale);
			prModel.setStr1(str1);
			prModel.setStr2(str2);
			prModel.setImg(img);
			prModel.setProduct_id(rs.getString("Product_id"));

			list.add(prModel);
		}
		return list;
	}

	public List<productModel> queryProductLiving() throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select top 4 nameProduct, price, sale, img,Product_id from Product where prCategory_id='PK001'  order by newid()";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<productModel>();
		while (rs.next()) {
			@SuppressWarnings("unused")
			NumberFormat currentLocale = NumberFormat.getInstance();
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);

			String name_Product = rs.getString("nameProduct");
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			String img = rs.getString("img");
			productModel prModel = new productModel();
			prModel.setName_product(name_Product);
			prModel.setStr1(str1);
			prModel.setStr2(str2);
			prModel.setSale(sale);
			prModel.setImg(img);
			prModel.setProduct_id(rs.getString("Product_id"));
			list.add(prModel);
		}

		return list;

	}

	public List<productModel> queryProductBed() throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select top 4 nameProduct, price, sale, img, Product_id from Product where prCategory_id='PN001'  order by newid()";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<productModel>();
		while (rs.next()) {
			@SuppressWarnings("unused")
			NumberFormat currentLocale = NumberFormat.getInstance();
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);

			String name_Product = rs.getString("nameProduct");
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			String img = rs.getString("img");
			productModel prModel = new productModel();
			prModel.setName_product(name_Product);
			prModel.setStr1(str1);
			prModel.setSale(sale);
			prModel.setStr2(str2);
			prModel.setImg(img);
			prModel.setProduct_id(rs.getString("Product_id"));

			list.add(prModel);
		}

		return list;

	}

	public List<productModel> queryHouse() throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select top 3 nameProduct, price, sale, img, Product_id from Product where  prCategory_id='NTM01' order by newid()";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<>();
		while (rs.next()) {
			@SuppressWarnings("unused")
			NumberFormat currentLocale = NumberFormat.getInstance();
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);

			String name_Product = rs.getString("nameProduct");
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			String img = rs.getString("img");
			productModel prModel = new productModel();
			prModel.setName_product(name_Product);
			prModel.setStr1(str1);
			prModel.setSale(sale);
			prModel.setStr2(str2);
			prModel.setImg(img);
			prModel.setProduct_id(rs.getString("Product_id"));

			list.add(prModel);
		}
		return list;
	}

	public List<productModel> queryProductCategory(String Category_id) throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select top 6 Product_id, nameProduct, price, sale, img, nameCategory from Product,Category where Product.Category_id=Category.Category_id and Category.Category_id=?  ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, Category_id);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<>();
		while (rs.next()) {
			@SuppressWarnings("unused")
			NumberFormat currentLocale = NumberFormat.getInstance();
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);

			String Product_id = rs.getString("Product_id");
			String nameCategory = rs.getString("nameCategory");
			String name_Product = rs.getString("nameProduct");
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			String img = rs.getString("img");
			productModel prModel = new productModel();
			prModel.setName_product(name_Product);
			prModel.setStr1(str1);
			prModel.setSale(sale);
			prModel.setStr2(str2);
			prModel.setImg(img);
			prModel.setNameCategory(nameCategory);
			prModel.setProduct_id(Product_id);

			list.add(prModel);
		}
		return list;
	}

	public List<productModel> queryProductPrCategory(String prCategory_id) throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select top 12 Product_id,nameProduct, price, sale, img from Product where prCategory_id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, prCategory_id);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<>();
		while (rs.next()) {
			@SuppressWarnings("unused")
			NumberFormat currentLocale = NumberFormat.getInstance();
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);

			String name_Product = rs.getString("nameProduct");
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			String img = rs.getString("img");
			productModel prModel = new productModel();
			prModel.setName_product(name_Product);
			prModel.setStr1(str1);
			prModel.setStr2(str2);
			prModel.setImg(img);
			prModel.setSale(sale);
			prModel.setProduct_id(rs.getString("Product_id"));

			list.add(prModel);
		}
		return list;
	}

	public List<productModel> queryDetailProduct(String Product_id) throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select * from Product where Product_id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, Product_id);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<>();
		while (rs.next()) {
			@SuppressWarnings("unused")
			NumberFormat currentLocale = NumberFormat.getInstance();
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);

			String name_Product = rs.getString("nameProduct");
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			String img = rs.getString("img");
			productModel prModel = new productModel();
			prModel.setName_product(name_Product);
			prModel.setStr1(str1);
			prModel.setStr2(str2);
			prModel.setImg(img);
			prModel.setAmount(rs.getInt("amount"));
			prModel.setColor(rs.getString("color"));
			prModel.setDescribe(rs.getString("describe"));
			prModel.setProducer(rs.getString("producer"));
			prModel.setProduct_id(rs.getString("Product_id"));
			prModel.setSize(rs.getString("size"));
			prModel.setSale(sale);

			list.add(prModel);
		}
		return list;
	}

	public List<productModel> querySearchProduct(String name_product) throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select * from Product where nameProduct like N'%" + name_product + "%'";
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
			prModel.setDescribe(rs.getString("describe"));
			prModel.setProducer(rs.getString("producer"));
			prModel.setProduct_id(rs.getString("Product_id"));
			prModel.setSize(rs.getString("size"));
			prModel.setSale(sale);

			list.add(prModel);
		}
		return list;
	}

	public int kqSearch(String name_product) throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();

		String sql = "select count(nameProduct) as kq from Product where nameProduct like N'%" + name_product + "%'";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int count = 0;
		while (rs.next()) {
			count = rs.getInt(1);
		}
		return count;

	}

	// select count(nameProduct) as kq from Product where nameProduct like N'%ngủ%'
	public static productModel findProduct(Connection conn, String product_id) throws SQLException {
		String sql = "select * from Product where Product_id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			NumberFormat currentLocale = NumberFormat.getInstance();
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);

			String name_Product = rs.getString("nameProduct");
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			String img = rs.getString("img");
			productModel product = new productModel();
			product.setName_product(name_Product);
			product.setStr1(str1);
			product.setStr2(str2);
			product.setImg(img);
			product.setSale(sale);
			product.setProduct_id(rs.getString("Product_id"));
			return product;
		}
		return null;
	}

}
