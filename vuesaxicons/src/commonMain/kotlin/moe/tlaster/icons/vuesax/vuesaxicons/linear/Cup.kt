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

public val LinearGroup.Cup: ImageVector
    get() {
        if (_cup != null) {
            return _cup!!
        }
        _cup = Builder(name = "Cup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.15f, 16.5f)
                verticalLineTo(18.6f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.15f, 22.0f)
                horizontalLineTo(17.15f)
                verticalLineTo(21.0f)
                curveTo(17.15f, 19.9f, 16.25f, 19.0f, 15.15f, 19.0f)
                horizontalLineTo(9.15f)
                curveTo(8.05f, 19.0f, 7.15f, 19.9f, 7.15f, 21.0f)
                verticalLineTo(22.0f)
                verticalLineTo(22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.15f, 22.0f)
                horizontalLineTo(18.15f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveTo(8.13f, 16.0f, 5.0f, 12.87f, 5.0f, 9.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 3.79f, 6.79f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(17.21f, 2.0f, 19.0f, 3.79f, 19.0f, 6.0f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 12.87f, 15.87f, 16.0f, 12.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.47f, 11.65f)
                curveTo(4.72f, 11.41f, 4.06f, 10.97f, 3.54f, 10.45f)
                curveTo(2.64f, 9.45f, 2.04f, 8.25f, 2.04f, 6.85f)
                curveTo(2.04f, 5.45f, 3.14f, 4.35f, 4.54f, 4.35f)
                horizontalLineTo(5.19f)
                curveTo(4.99f, 4.81f, 4.89f, 5.32f, 4.89f, 5.85f)
                verticalLineTo(8.85f)
                curveTo(4.89f, 9.85f, 5.1f, 10.79f, 5.47f, 11.65f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.53f, 11.65f)
                curveTo(19.28f, 11.41f, 19.94f, 10.97f, 20.46f, 10.45f)
                curveTo(21.36f, 9.45f, 21.96f, 8.25f, 21.96f, 6.85f)
                curveTo(21.96f, 5.45f, 20.86f, 4.35f, 19.46f, 4.35f)
                horizontalLineTo(18.81f)
                curveTo(19.01f, 4.81f, 19.11f, 5.32f, 19.11f, 5.85f)
                verticalLineTo(8.85f)
                curveTo(19.11f, 9.85f, 18.9f, 10.79f, 18.53f, 11.65f)
                close()
            }
        }
        .build()
        return _cup!!
    }

private var _cup: ImageVector? = null
