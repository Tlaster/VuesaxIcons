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

public val TwotoneGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.3909f, 5.21f)
                lineTo(16.8009f, 8.03f)
                curveTo(16.9909f, 8.42f, 17.5009f, 8.79f, 17.9309f, 8.87f)
                lineTo(20.4809f, 9.29f)
                curveTo(22.1109f, 9.56f, 22.4909f, 10.74f, 21.3209f, 11.92f)
                lineTo(19.3309f, 13.91f)
                curveTo(19.0009f, 14.24f, 18.8109f, 14.89f, 18.9209f, 15.36f)
                lineTo(19.4909f, 17.82f)
                curveTo(19.9409f, 19.76f, 18.9009f, 20.52f, 17.1909f, 19.5f)
                lineTo(14.8009f, 18.08f)
                curveTo(14.3709f, 17.82f, 13.6509f, 17.82f, 13.2209f, 18.08f)
                lineTo(10.8309f, 19.5f)
                curveTo(9.1209f, 20.51f, 8.0809f, 19.76f, 8.5309f, 17.82f)
                lineTo(9.1009f, 15.36f)
                curveTo(9.2109f, 14.9f, 9.0209f, 14.25f, 8.6909f, 13.91f)
                lineTo(6.7009f, 11.92f)
                curveTo(5.5309f, 10.75f, 5.9109f, 9.57f, 7.5409f, 9.29f)
                lineTo(10.0909f, 8.87f)
                curveTo(10.5209f, 8.8f, 11.0309f, 8.42f, 11.2209f, 8.03f)
                lineTo(12.6309f, 5.21f)
                curveTo(13.3809f, 3.68f, 14.6209f, 3.68f, 15.3909f, 5.21f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                horizontalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                horizontalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                horizontalLineTo(2.0f)
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
