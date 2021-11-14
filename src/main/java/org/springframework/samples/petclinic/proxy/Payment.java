package org.springframework.samples.petclinic.proxy;

@FunctionalInterface
public interface Payment {

	void pay(int amount);
}
