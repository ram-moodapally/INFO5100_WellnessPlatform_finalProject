/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.WellnessPlatform.getValue())){
            organization=new WellnessPlatformOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HealthConsultation.getValue())){
            organization=new HealthConsultationOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FitnessConsultation.getValue())){
            organization=new FitnessConsultationOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NutritionConsultation.getValue())){
            organization=new NutritionConsultationOrganization();
            organizationList.add(organization);
        }
                else if (type.getValue().equals(Type.Manufacturing.getValue())){
            organization=new ManufacturingOrganization();
            organizationList.add(organization);
        }
                else if (type.getValue().equals(Type.Pharma.getValue())){
            organization=new PharmaOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.Restaurant.getValue())){
            organization=new RestaurantOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}