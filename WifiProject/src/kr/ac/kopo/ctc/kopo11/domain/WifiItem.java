package kr.ac.kopo.ctc.kopo11.domain;

public class WifiItem {
	// 번호
	private int kopo11_id; 
	// 설치장소명
	private String kopo11_installationLocationName; 
	// 설치장소상세
	private String kopo11_installationLocationDetails;
	// 설치시도명
	private String kopo11_installationCityName; 
	// 설치시군구명
	private String kopo11_installationDistrictName; 
	// 설치시설구분
	private String kopo11_installationFacilityType; 
	// 서비스제공사명
	private String kopo11_serviceProviderName; 
	// 와이파이SSID
	private String kopo11_wifiSsid; 
	// 설치연월
	private String kopo11_dateOfInstallation; 
	// 소재지도로명주소
	private String kopo11_roadNameAddress; 
	// 소재지지번주소
	private String kopo11_lotNumberAddress; 
	// 관리기관명
	private String kopo11_managementAgencyName; 
	// 관리기관전화번호
	private String kopo11_managementAgencyPhoneNumber; 
	// 위도
	private double kopo11_latitude; 
	// 경도 
	private double kopo11_longitude; 
	// 데이터기준일자
	private String kopo11_created;
	
	
	// 항목 번호, 도로명 주소, 위도, 경도를 생성자로 받는다.
	public WifiItem(int kopo11_id,String kopo11_roadNameAddress,double kopo11_latitude,double kopo11_longitude){
		this.kopo11_id = kopo11_id;
		this.kopo11_roadNameAddress = kopo11_roadNameAddress;
		this.kopo11_latitude = kopo11_latitude;
		this.kopo11_longitude = kopo11_longitude;
	}
	
	
	public int getId() {
		return kopo11_id;
	}
	public void setId(int kopo11_id) {
		this.kopo11_id = kopo11_id;
	}
	public String getInstallationLocationName() {
		return kopo11_installationLocationName;
	}
	public void setInstallationLocationName(String kopo11_installationLocationName) {
		this.kopo11_installationLocationName = kopo11_installationLocationName;
	}
	public String getInstallationLocationDetails() {
		return kopo11_installationLocationDetails;
	}
	public void setInstallationLocationDetails(String kopo11_installationLocationDetails) {
		this.kopo11_installationLocationDetails = kopo11_installationLocationDetails;
	}
	public String getInstallationCityName() {
		return kopo11_installationCityName;
	}
	public void setInstallationCityName(String kopo11_installationCityName) {
		this.kopo11_installationCityName = kopo11_installationCityName;
	}
	public String getInstallationDistrictName() {
		return kopo11_installationDistrictName;
	}
	public void setInstallationDistrictName(String kopo11_installationDistrictName) {
		this.kopo11_installationDistrictName = kopo11_installationDistrictName;
	}
	public String getInstallationFacilityType() {
		return kopo11_installationFacilityType;
	}
	public void setInstallationFacilityType(String kopo11_installationFacilityType) {
		this.kopo11_installationFacilityType = kopo11_installationFacilityType;
	}
	public String getServiceProviderName() {
		return kopo11_serviceProviderName;
	}
	public void setServiceProviderName(String kopo11_serviceProviderName) {
		this.kopo11_serviceProviderName = kopo11_serviceProviderName;
	}
	public String getWifiSsid() {
		return kopo11_wifiSsid;
	}
	public void setWifiSsid(String kopo11_wifiSsid) {
		this.kopo11_wifiSsid = kopo11_wifiSsid;
	}
	public String getDateOfInstallation() {
		return kopo11_dateOfInstallation;
	}
	public void setDateOfInstallation(String kopo11_dateOfInstallation) {
		this.kopo11_dateOfInstallation = kopo11_dateOfInstallation;
	}
	public String getRoadNameAddress() {
		return kopo11_roadNameAddress;
	}
	public void setRoadNameAddress(String kopo11_roadNameAddress) {
		this.kopo11_roadNameAddress = kopo11_roadNameAddress;
	}
	public String getLotNumberAddress() {
		return kopo11_lotNumberAddress;
	}
	public void setLotNumberAddress(String kopo11_lotNumberAddress) {
		this.kopo11_lotNumberAddress = kopo11_lotNumberAddress;
	}
	public String getManagementAgencyName() {
		return kopo11_managementAgencyName;
	}
	public void setManagementAgencyName(String kopo11_managementAgencyName) {
		this.kopo11_managementAgencyName = kopo11_managementAgencyName;
	}
	public String getManagementAgencyPhoneNumber() {
		return kopo11_managementAgencyPhoneNumber;
	}
	public void setManagementAgencyPhoneNumber(String kopo11_managementAgencyPhoneNumber) {
		this.kopo11_managementAgencyPhoneNumber = kopo11_managementAgencyPhoneNumber;
	}
	public double getLatitude() {
		return kopo11_latitude;
	}
	public void setLatitude(double kopo11_latitude) {
		this.kopo11_latitude = kopo11_latitude;
	}
	public double getLongitude() {
		return kopo11_longitude;
	}
	public void setLongitude(double kopo11_longitude) {
		this.kopo11_longitude = kopo11_longitude;
	}
	public String getCreated() {
		return kopo11_created;
	}
	public void setCreated(String kopo11_created) {
		this.kopo11_created = kopo11_created;
	} 
	
	
}
