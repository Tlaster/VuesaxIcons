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

public val TwotoneGroup.Iostiost: ImageVector
    get() {
        if (_iostiost != null) {
            return _iostiost!!
        }
        _iostiost = Builder(name = "Iostiost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.99f, 2.5998f)
                lineTo(4.49f, 6.4198f)
                curveTo(3.88f, 6.7798f, 3.5f, 7.4398f, 3.5f, 8.1398f)
                verticalLineTo(15.8498f)
                curveTo(3.5f, 16.5598f, 3.88f, 17.2098f, 4.49f, 17.5698f)
                lineTo(10.99f, 21.3898f)
                curveTo(11.62f, 21.7598f, 12.39f, 21.7598f, 13.02f, 21.3898f)
                lineTo(19.52f, 17.5698f)
                curveTo(20.13f, 17.2098f, 20.51f, 16.5498f, 20.51f, 15.8498f)
                verticalLineTo(8.1398f)
                curveTo(20.51f, 7.4298f, 20.13f, 6.7798f, 19.52f, 6.4198f)
                lineTo(13.02f, 2.5998f)
                curveTo(12.39f, 2.2298f, 11.61f, 2.2298f, 10.99f, 2.5998f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                lineTo(12.0f, 6.0f)
                lineTo(7.0f, 9.0f)
                lineTo(17.0f, 15.0f)
                lineTo(12.0f, 18.0f)
                lineTo(7.0f, 15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 10.0f)
                lineTo(9.5f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 12.0f)
                lineTo(12.5f, 14.0f)
            }
        }
        .build()
        return _iostiost!!
    }

private var _iostiost: ImageVector? = null
