# BEGIN TEMPLATE
def reverse(list):
# BEGIN SOLUTION
  A = None
  B = list
  while B != None:
    A = new RecList(B.head, A)
    B = B.tail
  return A
# END SOLUTION
# END TEMPLATE
