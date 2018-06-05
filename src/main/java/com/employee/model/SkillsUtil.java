package com.employee.model;

public class SkillsUtil {
 public SkillsAndAbilities getSkill(){
     Domain domain = new Domain();
     domain.setGovernment(3);
     domain.setEducation(5);

     Technical technical = new Technical();
     technical.setAws(2);
     technical.setJava(4);

     Testing testing = new Testing();
     testing.setFitnesse(4);
     testing.setCucumber(3);
     testing.setCapybara(2);

     Consulting consulting = new Consulting();
     consulting.setCommunication(4);
     consulting.setPlanning(3);
     consulting.setQuestioning(2);

     SkillsAndAbilities skillsAndAbilities = new SkillsAndAbilities();
     skillsAndAbilities.setEmployeeId(62);
     skillsAndAbilities.setDomain(domain);
     skillsAndAbilities.setConsulting(consulting);
     skillsAndAbilities.setTechnical(technical);
     skillsAndAbilities.setTesting(testing);

     return skillsAndAbilities;
 };
}
