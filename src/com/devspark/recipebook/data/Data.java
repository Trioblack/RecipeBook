package com.devspark.recipebook.data;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author e.shishkin
 *
 */
public class Data {
	
	public static List<Recipe> snacks;
	public static List<Recipe> salads;
	public static List<Recipe> first;
	public static List<Recipe> second;
	public static List<Recipe> desserts;
	public static List<Recipe> beverages;
	
	public static void onInit() {
		setupSnacks();
		setupSalads();
		setupFirst();
		setupSecond();
		setupDesserts();
		setupBeverages();
	}
	
	private static void setupSnacks() {
		snacks = new ArrayList<Recipe>();
		snacks.add(new Recipe("������� Ǆ����������", 1));
		snacks.add(new Recipe("���������� Ǌ������", 2));
		snacks.add(new Recipe("������� ǌ������ ���������", 3));
		snacks.add(new Recipe("���������� � ����� ���������� �������", 4));
		snacks.add(new Recipe("������� � �������� ������", 5));
		snacks.add(new Recipe("�������� ����", 6));
		snacks.add(new Recipe("������������� ����", 7));
		snacks.add(new Recipe("��������� Ǐ����������", 8));
		snacks.add(new Recipe("������� Ǎ����������", 9));
		snacks.add(new Recipe("������������� �������", 10));
		snacks.add(new Recipe("������������� �����", 11));
		snacks.add(new Recipe("������� ���������� � ��������, ���������� � ������", 12));
		snacks.add(new Recipe("����������� ������ ��� �������", 13));
		snacks.add(new Recipe("��������� �������", 14));
		snacks.add(new Recipe("�������� ����", 15));
		snacks.add(new Recipe("�������� ��������", 16));
		snacks.add(new Recipe("�������� �� ������ � ������ � ��������", 17));
		snacks.add(new Recipe("����� � �������� � ����������", 18));
		snacks.add(new Recipe("�������� �� ������ � �������� � ��������� �����", 19));
		snacks.add(new Recipe("�����, ������������� ����� � ������", 20));
	}
	
	private static void setupSalads() {
		salads = new ArrayList<Recipe>();
		salads.add(new Recipe("������� Ǆ����������", 1));
		salads.add(new Recipe("���������� Ǌ������", 2));
		salads.add(new Recipe("������� ǌ������ ���������", 3));
		salads.add(new Recipe("���������� � ����� ���������� �������", 4));
		salads.add(new Recipe("������� � �������� ������", 5));
		salads.add(new Recipe("�������� ����", 6));
		salads.add(new Recipe("������������� ����", 7));
		salads.add(new Recipe("��������� Ǐ����������", 8));
		salads.add(new Recipe("������� Ǎ����������", 9));
		salads.add(new Recipe("������������� �������", 10));
		salads.add(new Recipe("������������� �����", 11));
		salads.add(new Recipe("������� ���������� � ��������, ���������� � ������", 12));
		salads.add(new Recipe("����������� ������ ��� �������", 13));
		salads.add(new Recipe("��������� �������", 14));
		salads.add(new Recipe("�������� ����", 15));
		salads.add(new Recipe("�������� ��������", 16));
		salads.add(new Recipe("�������� �� ������ � ������ � ��������", 17));
		salads.add(new Recipe("����� � �������� � ����������", 18));
		salads.add(new Recipe("�������� �� ������ � �������� � ��������� �����", 19));
		salads.add(new Recipe("�����, ������������� ����� � ������", 20));
	}
	
	private static void setupFirst() {
		first = new ArrayList<Recipe>();
		first.add(new Recipe("������� Ǆ����������", 1));
		first.add(new Recipe("���������� Ǌ������", 2));
		first.add(new Recipe("������� ǌ������ ���������", 3));
		first.add(new Recipe("���������� � ����� ���������� �������", 4));
		first.add(new Recipe("������� � �������� ������", 5));
		first.add(new Recipe("�������� ����", 6));
		first.add(new Recipe("������������� ����", 7));
		first.add(new Recipe("��������� Ǐ����������", 8));
		first.add(new Recipe("������� Ǎ����������", 9));
		first.add(new Recipe("������������� �������", 10));
		first.add(new Recipe("������������� �����", 11));
		first.add(new Recipe("������� ���������� � ��������, ���������� � ������", 12));
		first.add(new Recipe("����������� ������ ��� �������", 13));
		first.add(new Recipe("��������� �������", 14));
		first.add(new Recipe("�������� ����", 15));
		first.add(new Recipe("�������� ��������", 16));
		first.add(new Recipe("�������� �� ������ � ������ � ��������", 17));
		first.add(new Recipe("����� � �������� � ����������", 18));
		first.add(new Recipe("�������� �� ������ � �������� � ��������� �����", 19));
		first.add(new Recipe("�����, ������������� ����� � ������", 20));
	}
	
	private static void setupSecond() {
		second = new ArrayList<Recipe>();
		second.add(new Recipe("������� Ǆ����������", 1));
		second.add(new Recipe("���������� Ǌ������", 2));
		second.add(new Recipe("������� ǌ������ ���������", 3));
		second.add(new Recipe("���������� � ����� ���������� �������", 4));
		second.add(new Recipe("������� � �������� ������", 5));
		second.add(new Recipe("�������� ����", 6));
		second.add(new Recipe("������������� ����", 7));
		second.add(new Recipe("��������� Ǐ����������", 8));
		second.add(new Recipe("������� Ǎ����������", 9));
		second.add(new Recipe("������������� �������", 10));
		second.add(new Recipe("������������� �����", 11));
		second.add(new Recipe("������� ���������� � ��������, ���������� � ������", 12));
		second.add(new Recipe("����������� ������ ��� �������", 13));
		second.add(new Recipe("��������� �������", 14));
		second.add(new Recipe("�������� ����", 15));
		second.add(new Recipe("�������� ��������", 16));
		second.add(new Recipe("�������� �� ������ � ������ � ��������", 17));
		second.add(new Recipe("����� � �������� � ����������", 18));
		second.add(new Recipe("�������� �� ������ � �������� � ��������� �����", 19));
		second.add(new Recipe("�����, ������������� ����� � ������", 20));
	}
	
	private static void setupDesserts() {
		desserts = new ArrayList<Recipe>();
		desserts.add(new Recipe("������� Ǆ����������", 1));
		desserts.add(new Recipe("���������� Ǌ������", 2));
		desserts.add(new Recipe("������� ǌ������ ���������", 3));
		desserts.add(new Recipe("���������� � ����� ���������� �������", 4));
		desserts.add(new Recipe("������� � �������� ������", 5));
		desserts.add(new Recipe("�������� ����", 6));
		desserts.add(new Recipe("������������� ����", 7));
		desserts.add(new Recipe("��������� Ǐ����������", 8));
		desserts.add(new Recipe("������� Ǎ����������", 9));
		desserts.add(new Recipe("������������� �������", 10));
		desserts.add(new Recipe("������������� �����", 11));
		desserts.add(new Recipe("������� ���������� � ��������, ���������� � ������", 12));
		desserts.add(new Recipe("����������� ������ ��� �������", 13));
		desserts.add(new Recipe("��������� �������", 14));
		desserts.add(new Recipe("�������� ����", 15));
		desserts.add(new Recipe("�������� ��������", 16));
		desserts.add(new Recipe("�������� �� ������ � ������ � ��������", 17));
		desserts.add(new Recipe("����� � �������� � ����������", 18));
		desserts.add(new Recipe("�������� �� ������ � �������� � ��������� �����", 19));
		desserts.add(new Recipe("�����, ������������� ����� � ������", 20));
	}
	
	private static void setupBeverages() {
		beverages = new ArrayList<Recipe>();
		beverages.add(new Recipe("������� Ǆ����������", 1));
		beverages.add(new Recipe("���������� Ǌ������", 2));
		beverages.add(new Recipe("������� ǌ������ ���������", 3));
		beverages.add(new Recipe("���������� � ����� ���������� �������", 4));
		beverages.add(new Recipe("������� � �������� ������", 5));
		beverages.add(new Recipe("�������� ����", 6));
		beverages.add(new Recipe("������������� ����", 7));
		beverages.add(new Recipe("��������� Ǐ����������", 8));
		beverages.add(new Recipe("������� Ǎ����������", 9));
		beverages.add(new Recipe("������������� �������", 10));
	}

}
