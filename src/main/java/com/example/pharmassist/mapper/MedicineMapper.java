package com.example.pharmassist.mapper;

import org.springframework.stereotype.Component;

import com.example.pharmassist.entity.Medicine;
import com.example.pharmassist.requestdtos.MedicineRequest;
import com.example.pharmassist.responsedtos.MedicineResponse;

@Component
public class MedicineMapper {
	
		public Medicine mapToMedicine (MedicineRequest medicineRequest, Medicine medicine) {
			
			medicine.setName(medicineRequest.getName());
			medicine.setCategory(medicineRequest.getCategory());
			medicine.setDosageInMg(medicineRequest.getDosageInMg());
			medicine.setExpiryDate(medicineRequest.getExpiryDate());
			medicine.setForm(medicineRequest.getForm());
			medicine.setManufacturer(medicineRequest.getManufacturer());
			medicine.setIngredients(medicineRequest.getIngredients());
			medicine.setPrice(medicineRequest.getPrice());
			medicine.setStockQuantity(medicineRequest.getStockQuantity());
			
			return medicine;
		}
		
		
		public MedicineResponse mapToMedicineResponse (Medicine medicine) {
			
			MedicineResponse medicineResponse = new MedicineResponse();
			
			medicineResponse.setMedicineId(medicine.getMedicineId());
			medicineResponse.setName(medicine.getName());
			medicineResponse.setCategory(medicine.getCategory());
			medicineResponse.setDosageInMg(medicine.getDosageInMg());
			medicineResponse.setExpiryDate(medicine.getExpiryDate());
			medicineResponse.setForm(medicine.getForm());
			medicineResponse.setManufacturer(medicine.getManufacturer());
			medicineResponse.setIngredients(medicine.getIngredients());
			medicineResponse.setPrice(medicine.getPrice());
			medicineResponse.setStockQuantity(medicine.getStockQuantity());
			
			
			return medicineResponse;
			
		}


}
