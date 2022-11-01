package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Iconicx: ImageVector
    get() {
        if (_iconicx != null) {
            return _iconicx!!
        }
        _iconicx = Builder(name = "Iconicx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.6f, 6.0f)
                curveTo(14.55f, 5.37f, 13.32f, 5.0f, 12.0f, 5.0f)
                curveTo(8.13f, 5.0f, 5.0f, 8.13f, 5.0f, 12.0f)
                curveTo(5.0f, 13.34f, 5.38f, 14.59f, 6.03f, 15.65f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.3398f, 17.9701f)
                curveTo(9.4098f, 18.6201f, 10.6598f, 19.0001f, 11.9998f, 19.0001f)
                curveTo(15.8698f, 19.0001f, 18.9998f, 15.8701f, 18.9998f, 12.0001f)
                curveTo(18.9998f, 10.6601f, 18.6198f, 9.4101f, 17.9698f, 8.3501f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 3.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2002f, 3.7998f)
                horizontalLineTo(20.3002f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 3.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7002f, 20.2002f)
                horizontalLineTo(3.8002f)
            }
        }
        .build()
        return _iconicx!!
    }

private var _iconicx: ImageVector? = null
