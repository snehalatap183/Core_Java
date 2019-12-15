package com.scp.loop;

import java.util.Arrays;

public class Opconcepts {

	// custage = 20
	public static void main(String[] args) {

		Account ac1 = new Account(1111, "Saving", 28823.34);
		Account ac2 = new Account(2222, "Saving", 458823.34);
		Account ac3 = new Account(1441, "Saving", 8823.34);
		Account ac4 = new Account(2552, "Saving", 4823.34);

		Account[] cust1Accounts = { ac1, ac2 };
		Account[] cust2Accounts = { ac3, ac4 };

		Customer customer1 = new Customer(1, "A", 22, "Pune", "M", null, null);
		customer1.setAccounts(cust1Accounts);

		Customer customer2 = new Customer(2, "B", 245, "Pune", "M", null, null);
		customer2.setAccounts(cust2Accounts);

		Bank sbi = new Bank(111882, "SBI", "Pune", null, null, null);

		Card card1 = new Card(99929, sbi, customer1.getCustId(), customer1.getAccounts()[0].getAccNo(), 1111);
		Card card3 = new Card(99939, sbi, customer1.getCustId(), customer1.getAccounts()[1].getAccNo(), 2222);

		Card card2 = new Card(49999, sbi, customer2.getCustId(), customer2.getAccounts()[0].getAccNo(), 1344);
		Card card4 = new Card(95999, sbi, customer2.getCustId(), customer2.getAccounts()[1].getAccNo(), 2233);

		Card cust1Cards[] = { card1, card3 };
		Card cust2Cards[] = { card2, card4 };
		Card bankCards[] = { card1, card2, card3, card4 };
		customer1.setCards(cust1Cards);
		customer2.setCards(cust2Cards);

		Customer customers[] = { customer1, customer2 };
		sbi.setBankCustomers(customers);

		Account bankAccount = new Account(1182, "Current", 28282.34);
		sbi.setAccount(bankAccount);

		sbi.setGivenCards(bankCards);

		System.out.println(sbi);

		// Card duplicateCard = new
		// Card(95999,sbi,customer2.getCustId(),customer2.getAccounts()[1].getAccNo(),3233);
		ATMServices service = new HDFCBank();
		service.depositAmount(card1, 10000);

		System.out.println(Arrays.toString(sbi.getBankCustomers()));
	}

}

class Customer {
	private int custId;
	private String custName;
	private int custAge;
	private String custAddress;
	private String gender;
	private Account[] accounts;
	private Card[] cards;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	public Customer(int custId, String custName, int custAge, String custAddress, String gender, Account[] accounts,
			Card[] cards) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
		this.custAddress = custAddress;
		this.gender = gender;
		this.accounts = accounts;
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "\n\t\t [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + ", custAddress="
				+ custAddress + ", gender=" + gender + ", accounts=" + Arrays.toString(accounts) + ", cards="
				+ Arrays.toString(cards) + "]";
	}

}

class Account {
	private int accNo;
	private String accType;
	private double accBalance;

	@Override
	public String toString() {
		return "\n\t\t\t\t [accNo=" + accNo + ", accType=" + accType + ", accBalance=" + accBalance + "]";
	}

	public Account(int accNo, String accType, double accBalance) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.accBalance = accBalance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

}

class Bank {
	private int ifscCode;
	private String bankName;
	private String bankAddress;
	private Customer[] bankCustomers;// cust--accounts
	private Account account;// bank account
	private Card[] givenCards;

	public Bank(int ifscCode, String bankName, String bankAddress, Customer[] bankCustomers, Account account,
			Card[] givenCards) {
		super();
		this.ifscCode = ifscCode;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankCustomers = bankCustomers;
		this.account = account;
		this.givenCards = givenCards;
	}

	public int getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public Customer[] getBankCustomers() {
		return bankCustomers;
	}

	public void setBankCustomers(Customer[] bankCustomers) {
		this.bankCustomers = bankCustomers;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Card[] getGivenCards() {
		return givenCards;
	}

	public void setGivenCards(Card[] givenCards) {
		this.givenCards = givenCards;
	}

	@Override
	public String toString() {
		return "Bank [ifscCode=" + ifscCode + ", bankName=" + bankName + ", bankAddress=" + bankAddress
				+ ",\n\tbankCustomers=" + Arrays.toString(bankCustomers) + ",\n account=" + account + ", givenCards="
				+ Arrays.toString(givenCards) + "]";
	}

}

class Card {
	private int cardNo;
	private Bank ifscCode;
	private int custId;
	private int accNo;
	private int pin;

	public Card(int cardNo, Bank ifscCode, int custId, int accNo, int pin) {
		super();
		this.cardNo = cardNo;
		this.ifscCode = ifscCode;
		this.custId = custId;
		this.accNo = accNo;
		this.pin = pin;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public Bank getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(Bank ifscCode) {
		this.ifscCode = ifscCode;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "\n\t\t\t\t\t\t [cardNo=" + cardNo + ", ifscCode=" + ifscCode.getBankName() + ", custId=" + custId
				+ ", accNo=" + accNo + ", pin=" + pin + "]";
	}

}

interface ATMServices {
	public void depositAmount(Card card, double amount);

	public void withdrawAmount(Card card, double amount);
}

class HDFCBank implements ATMServices {

	@Override
	public void depositAmount(Card card, double amount) {
		if (card != null) {
			Bank bank = card.getIfscCode();
			if (bank != null && amount > 0) {
				Customer[] customers = bank.getBankCustomers();
				for (Customer customer : customers) {
					if (customer != null && customer.getCustId() == card.getCustId()) {
						System.out.println("Customer Found" + customer);

						boolean flag = checkPin(card, bank);

						if (flag) {
							Account[] accounts = customer.getAccounts();
							for (Account acc : accounts) {
								if (acc != null && acc.getAccNo() == card.getAccNo()) {
									double existingBal = acc.getAccBalance();
									existingBal += amount;
									acc.setAccBalance(existingBal);
									System.out.println("Trascation completed..!");
									return;
								}
							}
						} else {
							System.out.println("invalid pin");
						}

						break;
					}
				}

			} else {
				System.out.println("invalid bank or amount");
			}

		} else {
			System.out.println("invalid card..");
		}

	}

	private boolean checkPin(Card usercard, Bank bank) {
		Card[] bankCardsInfo = bank.getGivenCards();
		for (Card bkcard : bankCardsInfo) {
			if (bkcard.getCardNo() == usercard.getCardNo() && bkcard.getPin() == usercard.getPin()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void withdrawAmount(Card card, double amount) {

	}

}
