package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Bagcross1: ImageVector
    get() {
        if (_bagcross1 != null) {
            return _bagcross1!!
        }
        _bagcross1 = Builder(name = "Bagcross1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.39f, 17.36f)
                lineTo(10.64f, 14.61f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.36f, 14.64f)
                lineTo(10.61f, 17.39f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.81f, 2.0f)
                lineTo(5.19f, 5.63f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.19f, 2.0f)
                lineTo(18.81f, 5.63f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 7.85f)
                curveTo(2.0f, 6.0f, 2.99f, 5.85f, 4.22f, 5.85f)
                horizontalLineTo(19.78f)
                curveTo(21.01f, 5.85f, 22.0f, 6.0f, 22.0f, 7.85f)
                curveTo(22.0f, 10.0f, 21.01f, 9.85f, 19.78f, 9.85f)
                horizontalLineTo(4.22f)
                curveTo(2.99f, 9.85f, 2.0f, 10.0f, 2.0f, 7.85f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 10.0f)
                lineTo(4.91f, 18.64f)
                curveTo(5.23f, 20.58f, 6.0f, 22.0f, 8.86f, 22.0f)
                horizontalLineTo(14.89f)
                curveTo(18.0f, 22.0f, 18.46f, 20.64f, 18.82f, 18.76f)
                lineTo(20.5f, 10.0f)
            }
        }
        .build()
        return _bagcross1!!
    }

private var _bagcross1: ImageVector? = null
