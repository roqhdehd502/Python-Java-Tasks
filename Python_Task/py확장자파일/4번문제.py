"""
4. 두 원에 대한 중점 좌표와 반지름을 입력받고 두 원을 출력한 뒤 
원이 내포 또는 중첩되어 있는지 판별하는 프로그램을 작성하시오.
(단, 입력 시 동시할당문을 사용하시오.)
"""

import numpy as np
import math, cv2

#두 원의 좌표 및 반지름 입력
X1, Y1, R1 = input("원 1에 대한 x좌표, y좌표, 반지름을 입력하시오:").split(", ")
X2, Y2, R2 = input("원 2에 대한 x좌표, y좌표, 반지름을 입력하시오:").split(", ")
X1, Y1, R1 = float(X1), float(Y1), float(R1)
X2, Y2, R2 = float(X2), float(Y2), float(R2)

#두 원의 중점거리
def distance(x1, y1, x2, y2):
          
    return math.sqrt(math.pow((x1-x2),2) + math.pow((y1-y2),2))

#원과 원의 관계
d = distance(X1, Y1, X2, Y2)
                    
if (R2+R1) > d:
    if d > (R2-R1):
        print("두 원이 두 점에서 만나 있습니다.(중첩)")
elif (R2+R1) == d:
    print("두 원이 한 점에서 외접해 있습니다.(중첩)")#한 점에서 만나는 것도 중첩으로 처리했습니다.
elif (R2-R1) == d:
    print("두 원이 한 점에서 내접해 있습니다.(내포)")
elif d == 0:
    print("두 원이 동심원으로 되어있습니다.(내포)")
else:
    print("두 원이 만나지 않았습니다.")

#두 원을 출력
a1, b1, c1 = int(X1), int(Y1), int(R1)
a2, b2, c2 = int(X2), int(Y2), int(R2)

img = np.zeros((500, 500, 3), np.uint8)
img = cv2.circle(img, (a1,b1), c1, (255,0,0), 5)#(img, 중점좌표, 반지름, blue, 두께)
img = cv2.circle(img, (a2,b2), c2, (0,0,255), 5)#(img, 중점좌표, 반지름, red, 두께)
cv2.imshow('image',img)
cv2.waitKey(0)
cv2.destroyAllWindows()