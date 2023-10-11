import com.google.gson.Gson

fun Any.toGsonString(): String {
    return Gson().toJson(this)
}