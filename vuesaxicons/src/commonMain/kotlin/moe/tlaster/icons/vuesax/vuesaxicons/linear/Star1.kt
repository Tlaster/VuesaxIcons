package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Star1: ImageVector
    get() {
        if (_star1 != null) {
            return _star1!!
        }
        _star1 = Builder(name = "Star1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.39f, 5.21f)
                lineTo(16.7999f, 8.03f)
                curveTo(16.9899f, 8.42f, 17.4999f, 8.79f, 17.9299f, 8.87f)
                lineTo(20.48f, 9.29f)
                curveTo(22.11f, 9.56f, 22.49f, 10.74f, 21.32f, 11.92f)
                lineTo(19.3299f, 13.91f)
                curveTo(18.9999f, 14.24f, 18.81f, 14.89f, 18.92f, 15.36f)
                lineTo(19.4899f, 17.82f)
                curveTo(19.9399f, 19.76f, 18.9f, 20.52f, 17.19f, 19.5f)
                lineTo(14.7999f, 18.08f)
                curveTo(14.3699f, 17.82f, 13.65f, 17.82f, 13.22f, 18.08f)
                lineTo(10.8299f, 19.5f)
                curveTo(9.1199f, 20.51f, 8.08f, 19.76f, 8.53f, 17.82f)
                lineTo(9.1f, 15.36f)
                curveTo(9.21f, 14.9f, 9.0199f, 14.25f, 8.6899f, 13.91f)
                lineTo(6.7f, 11.92f)
                curveTo(5.53f, 10.75f, 5.91f, 9.57f, 7.54f, 9.29f)
                lineTo(10.0899f, 8.87f)
                curveTo(10.5199f, 8.8f, 11.03f, 8.42f, 11.22f, 8.03f)
                lineTo(12.63f, 5.21f)
                curveTo(13.38f, 3.68f, 14.62f, 3.68f, 15.39f, 5.21f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                horizontalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                horizontalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                horizontalLineTo(2.0f)
            }
        }
        .build()
        return _star1!!
    }

private var _star1: ImageVector? = null
