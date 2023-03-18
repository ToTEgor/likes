fun main (){
var likes = 22
    if(likes == 11) {
        println("Понравилось $likes людям")
    }else if (likes == 1 || likes % 10 == 1 || likes % 100 ==1){
        println("Понравилось $likes человеку")
    }else{
        println("Понравилось $likes людям")
    }
}