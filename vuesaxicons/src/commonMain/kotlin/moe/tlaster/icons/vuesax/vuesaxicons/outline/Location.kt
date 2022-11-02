package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0009f, 14.1699f)
                curveTo(9.8709f, 14.1699f, 8.1309f, 12.4399f, 8.1309f, 10.2999f)
                curveTo(8.1309f, 8.1599f, 9.8709f, 6.4399f, 12.0009f, 6.4399f)
                curveTo(14.1309f, 6.4399f, 15.8709f, 8.1699f, 15.8709f, 10.3099f)
                curveTo(15.8709f, 12.4499f, 14.1309f, 14.1699f, 12.0009f, 14.1699f)
                close()
                moveTo(12.0009f, 7.9399f)
                curveTo(10.7009f, 7.9399f, 9.6309f, 8.9999f, 9.6309f, 10.3099f)
                curveTo(9.6309f, 11.6199f, 10.6909f, 12.6799f, 12.0009f, 12.6799f)
                curveTo(13.3109f, 12.6799f, 14.3709f, 11.6199f, 14.3709f, 10.3099f)
                curveTo(14.3709f, 8.9999f, 13.3009f, 7.9399f, 12.0009f, 7.9399f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9997f, 22.76f)
                curveTo(10.5197f, 22.76f, 9.0297f, 22.2f, 7.8697f, 21.09f)
                curveTo(4.9197f, 18.25f, 1.6597f, 13.72f, 2.8897f, 8.33f)
                curveTo(3.9997f, 3.44f, 8.2697f, 1.25f, 11.9997f, 1.25f)
                curveTo(11.9997f, 1.25f, 11.9997f, 1.25f, 12.0097f, 1.25f)
                curveTo(15.7397f, 1.25f, 20.0097f, 3.44f, 21.1197f, 8.34f)
                curveTo(22.3397f, 13.73f, 19.0797f, 18.25f, 16.1297f, 21.09f)
                curveTo(14.9697f, 22.2f, 13.4797f, 22.76f, 11.9997f, 22.76f)
                close()
                moveTo(11.9997f, 2.75f)
                curveTo(9.0897f, 2.75f, 5.3497f, 4.3f, 4.3597f, 8.66f)
                curveTo(3.2797f, 13.37f, 6.2397f, 17.43f, 8.9197f, 20.0f)
                curveTo(10.6497f, 21.67f, 13.3597f, 21.67f, 15.0897f, 20.0f)
                curveTo(17.7597f, 17.43f, 20.7197f, 13.37f, 19.6597f, 8.66f)
                curveTo(18.6597f, 4.3f, 14.9097f, 2.75f, 11.9997f, 2.75f)
                close()
            }
        }
        .build()
        return _location!!
    }

private var _location: ImageVector? = null
