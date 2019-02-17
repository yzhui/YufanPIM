package com.sailmi.sailplat.foundation.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.sailmi.database.domain.IdEntity;
/**
 * 收藏
 * @author 
 *
 */
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
@Table(name = "tbl_favorite")
public class Favorite extends IdEntity {
	/**
	 * UID
	 */
	private static final long serialVersionUID = -6806868000509737275L;
	//类型
	private int type;
	
	//商品
	@ManyToOne
	private Goods goods;
	
	//店铺
	@ManyToOne
	private Store store;
	
	//用户
	@ManyToOne
	private User user;

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
