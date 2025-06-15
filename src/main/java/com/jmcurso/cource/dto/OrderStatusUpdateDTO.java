package com.jmcurso.cource.dto;

import jakarta.validation.constraints.NotNull;

public class OrderStatusUpdateDTO {

	@NotNull(message = "Status do pedido é obrigatório")
	private Integer orderStatus;

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
}
