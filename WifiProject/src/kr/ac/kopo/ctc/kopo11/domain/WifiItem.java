package kr.ac.kopo.ctc.kopo11.domain;

public class WifiItem {
	// ��ȣ
	private int kopo11_id; 
	// ��ġ��Ҹ�
	private String kopo11_installationLocationName; 
	// ��ġ��һ�
	private String kopo11_installationLocationDetails;
	// ��ġ�õ���
	private String kopo11_installationCityName; 
	// ��ġ�ñ�����
	private String kopo11_installationDistrictName; 
	// ��ġ�ü�����
	private String kopo11_installationFacilityType; 
	// �����������
	private String kopo11_serviceProviderName; 
	// ��������SSID
	private String kopo11_wifiSsid; 
	// ��ġ����
	private String kopo11_dateOfInstallation; 
	// ���������θ��ּ�
	private String kopo11_roadNameAddress; 
	// �����������ּ�
	private String kopo11_lotNumberAddress; 
	// ���������
	private String kopo11_managementAgencyName; 
	// ���������ȭ��ȣ
	private String kopo11_managementAgencyPhoneNumber; 
	// ����
	private double kopo11_latitude; 
	// �浵 
	private double kopo11_longitude; 
	// �����ͱ�������
	private String kopo11_created;
	
	
	// �׸� ��ȣ, ���θ� �ּ�, ����, �浵�� �����ڷ� �޴´�.
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
