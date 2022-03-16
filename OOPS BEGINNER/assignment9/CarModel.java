import java.util.*;
public class CarModel {
    private String licenceNumber;
    private String model;
    private Double currentMileage;
    private Integer engineSize;
    public String getLicenceNumber() {
        return licenceNumber;
    }
    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Double getCurrentMileage() {
        return currentMileage;
    }
    public CarModel() {
    }
    public void setCurrentMileage(Double currentMileage) {
        this.currentMileage = currentMileage;
    }
    public Integer getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(Integer engineSize) {
        this.engineSize = engineSize;
    }
    public CarModel(String licenceNumber, String model, Double currentMileage, Integer engineSize) {
        this.licenceNumber = licenceNumber;
        this.model = model;
        this.currentMileage = currentMileage;
        this.engineSize = engineSize;
    }
    @Override
    public String toString() {
        return "CarModel [currentMileage=" + currentMileage + ", engineSize=" + engineSize + ", licenceNumber="
                + licenceNumber + ", model=" + model + "]";
    }

	public void findCarList(String str, List<CarModel> cObj) {
		ArrayList<CarModel> cList = new ArrayList<CarModel>();
		for(int i=0; i<cObj.size(); i++) {
			if(str.equals(cObj.get(i).getModel()))
            cList.add(cObj.get(i));
		}
		if(cList.isEmpty())
			System.out.println("No Cars Found");
		else {
			for(CarModel c:cList)
				System.out.println(c.toString());
		}
	}
    public void findCarList(Double mileage, Integer enginesize ,  List<CarModel> cObj) {
		ArrayList<CarModel> cList = new ArrayList<CarModel>();
		for(int i=0; i<cObj.size(); i++) {
			if((cObj.get(i).getCurrentMileage() >= mileage) &&  (cObj.get(i).getEngineSize() >= enginesize))
            cList.add(cObj.get(i));
		}
		if(cList.isEmpty())
			System.out.println("No Cars Found");
		else {
			for(CarModel c:cList)
				System.out.println(c.toString());
		}
	}
    public List<CarModel> sortCarList(List<CarModel> obj){
        obj.sort(Comparator.comparing(CarModel::getModel));
        return obj;
}
}
