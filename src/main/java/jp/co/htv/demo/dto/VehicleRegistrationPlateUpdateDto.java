package jp.co.htv.demo.dto;

import java.util.List;
import jp.co.htv.demo.entity.ProvincePlates;

/**
 * Vehicle Registration Plate Update Dto.
 * 
 * @author hainp
 *
 */
public class VehicleRegistrationPlateUpdateDto {
    /** id property. */
    private Long id;

    /** province code property. */
    private String provinceCode;

    /** province name property. */
    private String provinceName;

    /** published property. */
    private boolean published;

    /** province plates list. */
    private List<ProvincePlates> provincePlatesList;

    /**
     * Gets the value of the id property.
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Gets the value of the id property.
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the value of the provinceCode property.
     * @return the provinceCode
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * Gets the value of the provinceCode property.
     * @param provinceCode the provinceCode to set
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * Gets the value of the provinceName property.
     * @return the provinceName
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * Gets the value of the provinceName property.
     * @param provinceName the provinceName to set
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * Gets the value of the published property.
     * @return the published
     */
    public boolean isPublished() {
        return published;
    }

    /**
     * Gets the value of the published property.
     * @param published the published to set
     */
    public void setPublished(boolean published) {
        this.published = published;
    }

    /**
     * Gets the value of the provincePlatesList property.
     * @return the provincePlatesList
     */
    public List<ProvincePlates> getProvincePlatesList() {
        return provincePlatesList;
    }

    /**
     * Gets the value of the provincePlatesList property.
     * @param provincePlatesList the provincePlatesList to set
     */
    public void setProvincePlatesList(List<ProvincePlates> provincePlatesList) {
        this.provincePlatesList = provincePlatesList;
    }

}
