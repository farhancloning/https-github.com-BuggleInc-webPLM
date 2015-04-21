package json.operation

import play.api.libs.json._
import lessons.sort.pancake.universe.operations._


object PancakeOperationToJson {
  
  def pancakeOperationWrite(pancakeOperation: PancakeOperation): JsValue =
  {
    var json:JsValue = null
    pancakeOperation match {
      case flipOperation: FlipOperation =>
        json = flipOperationWrite(flipOperation)
      case _ => json = Json.obj()
    }
    json = json.as[JsObject] ++ Json.obj(
        "pancakeID" -> pancakeOperation.getEntity.getName )
        return json
  }
  
  def flipOperationWrite(flipOperation: FlipOperation): JsValue =
  {
    Json.obj(
        "number" -> flipOperation.getNumber()
        )
  }

}