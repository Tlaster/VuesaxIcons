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

public val LinearGroup.Airpods: ImageVector
    get() {
        if (_airpods != null) {
            return _airpods!!
        }
        _airpods = Builder(name = "Airpods", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.72f, 9.56f)
                horizontalLineTo(5.78f)
                curveTo(3.7f, 9.56f, 2.0f, 7.86f, 2.0f, 5.78f)
                curveTo(2.0f, 3.7f, 3.7f, 2.0f, 5.78f, 2.0f)
                horizontalLineTo(7.67f)
                curveTo(9.23f, 2.0f, 10.5f, 3.28f, 10.5f, 4.83f)
                verticalLineTo(7.39f)
                verticalLineTo(17.1f)
                curveTo(10.5f, 18.14f, 9.65f, 18.99f, 8.61f, 18.99f)
                curveTo(7.57f, 18.99f, 6.72f, 18.14f, 6.72f, 17.1f)
                verticalLineTo(9.56f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.7801f, 6.72f)
                curveTo(5.2601f, 6.72f, 4.8401f, 6.3001f, 4.8401f, 5.7801f)
                curveTo(4.8401f, 5.2601f, 5.2601f, 4.8401f, 5.7801f, 4.8401f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.28f, 9.56f)
                horizontalLineTo(18.22f)
                curveTo(20.3f, 9.56f, 22.0f, 7.86f, 22.0f, 5.78f)
                curveTo(22.0f, 3.7f, 20.3f, 2.0f, 18.22f, 2.0f)
                horizontalLineTo(16.33f)
                curveTo(14.77f, 2.0f, 13.5f, 3.28f, 13.5f, 4.83f)
                verticalLineTo(7.39f)
                verticalLineTo(17.1f)
                curveTo(13.5f, 18.14f, 14.35f, 18.99f, 15.39f, 18.99f)
                curveTo(16.43f, 18.99f, 17.28f, 18.14f, 17.28f, 17.1f)
                verticalLineTo(9.56f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.22f, 6.72f)
                curveTo(18.74f, 6.72f, 19.16f, 6.3001f, 19.16f, 5.7801f)
                curveTo(19.16f, 5.2601f, 18.74f, 4.8401f, 18.22f, 4.8401f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 22.0f)
                verticalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 22.0f)
                verticalLineTo(19.0f)
            }
        }
        .build()
        return _airpods!!
    }

private var _airpods: ImageVector? = null
