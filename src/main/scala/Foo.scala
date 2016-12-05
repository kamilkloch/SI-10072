trait Foo[@specialized(Double,AnyRef)T] extends IndexedSeq[T] {

  override def sum[@specialized(Double, AnyRef) B >: T](implicit num: Numeric[B]): B = {
    foldLeft(num.zero)(num.plus)
  }
}
