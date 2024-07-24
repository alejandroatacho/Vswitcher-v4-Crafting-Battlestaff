//Title: V4 All In One Battlestaff Creator
//______________________________________________________________________________________________
int user_decision = 0;
//0 = Fire staff
//1 = Air Staff
//2 = Earth Staff
//3 = Water Staff
//______________________________________________________________________________________________

//Hinamizawa's Variables Down Below: 
int bStaff = 1391;
Widget multiSkillMenu = client.getWidget(270,13);
int orbs;
int finishedStaff;
//D0 fire
int F_Orbs = 569;
int deposit_item_1 = 1393;
//D1
int A_Orbs = 573;
int deposit_item_2 = 1397;
//D2
int E_Orbs = 575;
int deposit_item_3 = 1399;
//D3
int W_Orbs = 571;
int deposit_item_4 = 1395;

//Misc
   private void setStaffType() {
    if (user_decision == 0) {
        orbs = F_Orbs;
        finishedStaff = deposit_item_1;
}
    else if (user_decision == 1) {
        orbs = A_Orbs;
        finishedStaff = deposit_item_2;
    }
    else if (user_decision == 2) {
        orbs = E_Orbs;
        finishedStaff = deposit_item_3;
    }
    else if (user_decision == 3) {
        orbs = W_Orbs;
        finishedStaff = deposit_item_4;
    }
}

setStaffType();
if (multiSkillMenu != null) {
    v.invoke("Make","<col=ff9040>Fire battlestaff</col>",1,57,-1,17694734,false);
}

    else if (!v.getLocalPlayer().hasAnimation(7531) && (v.getInventory().amountInInventory(orbs, 14,14) && v.getInventory().amountInInventory(bStaff, 14,14))){   
            v.invoke("Use","<col=ff9040>Fire orb</col>",0,25,0,9764864,false);
            v.invoke("Use","<col=ff9040>Fire orb</col><col=ffffff> -> <col=ff9040>Battlestaff</col>",0,58,14,9764864,false);
            

    } 
    else if(v.getLocalPlayer().hasAnimation(-1) && v.getInventory().amountInInventory(finishedStaff, 14,14)) {

    v.getBank().deposit(finishedStaff, 14);
    v.getBank().withdraw(orbs,14);
    v.getBank().withdraw(bStaff,14);
    v.getBank().close();
}