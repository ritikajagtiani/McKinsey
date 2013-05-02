/**
 * 
 */
package com.mckinsey.billDisc.pojo;

import com.mckinsey.billDisc.types.ItemType;
import com.mckinsey.billDisc.types.UserType;

/**
 * @author Ritika Jagtiani
 *
 */
public class User {
  private int userId;
	private String userName;
	private UserType usertype;
	private Double bill;
	private ItemType itemType;
	
	public User(int i, String string, UserType userType, Double bill, ItemType itemType) {
		this.userId = i;
		this.userName = string;
		this.usertype = userType;
		this.bill = bill;
		this.itemType = itemType;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the usertype
	 */
	public UserType getUsertype() {
		return usertype;
	}
	/**
	 * @param usertype the usertype to set
	 */
	public void setUsertype(UserType usertype) {
		this.usertype = usertype;
	}
	/**
	 * @return the bill
	 */
	public Double getBill() {
		return bill;
	}
	/**
	 * @param bill the bill to set
	 */
	public void setBill(Double bill) {
		this.bill = bill;
	}
	/**
	 * @return the itemType
	 */
	public ItemType getItemType() {
		return itemType;
	}
	/**
	 * @param itemType the itemType to set
	 */
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=");
		builder.append(userId);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", usertype=");
		builder.append(usertype.name());
		builder.append(", bill=");
		builder.append(bill);
		builder.append(", itemType=");
		builder.append(itemType.name());
		builder.append("]");
		return builder.toString();
	}
}
