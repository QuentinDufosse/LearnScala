import java.util.{Date, Locale}
import java.text.DateFormat._
import java.util.Date
import java.util.Calendar

object HelloWorld {
  def main(args: Array[String]) {
    // Colonne value in the files
    val txId = 0
    val datetime = 1
    val magasin = 2
    val produitTransac = 3
    val qte = 4
    val produitRef = 0
    val prix  = 1
    // path to files
    val path = ".\\data\\"
    val logPath = ".\\phenix.log"
    	
    // Variables
    var listeVente: List[String] = List()
    var dates: List[String] = List()
    var i = 0;
    
    // get 7 last day as an arraylist
    val format = new java.text.SimpleDateFormat("yyyy-MM-dd")
    var date = new java.util.Date()
  
    var calendar = Calendar.getInstance()
    dates = dates.:::(List(format.format(calendar.getTime)))
  
    // for loop to get 7 days
    for( i <- 1 to 7){
      // 
      calendar.add(Calendar.DATE, -1)
      
  		dates = dates.:::(List(format.format(calendar.getTime)))
    }
    
    // for each date, get the file and register the data
    for( i <- 1 to dates.length){
      println(dates(i -1))
      // to:do everything
    }
  }
}