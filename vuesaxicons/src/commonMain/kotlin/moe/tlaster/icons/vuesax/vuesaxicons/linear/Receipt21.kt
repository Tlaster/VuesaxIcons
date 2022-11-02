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

public val LinearGroup.Receipt21: ImageVector
    get() {
        if (_receipt21 != null) {
            return _receipt21!!
        }
        _receipt21 = Builder(name = "Receipt21", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 7.04f)
                verticalLineTo(16.96f)
                curveTo(20.0f, 18.48f, 19.86f, 19.56f, 19.5f, 20.33f)
                curveTo(19.5f, 20.34f, 19.49f, 20.36f, 19.48f, 20.37f)
                curveTo(19.26f, 20.65f, 18.97f, 20.79f, 18.63f, 20.79f)
                curveTo(18.1f, 20.79f, 17.46f, 20.44f, 16.77f, 19.7f)
                curveTo(15.95f, 18.82f, 14.69f, 18.89f, 13.97f, 19.85f)
                lineTo(12.96f, 21.19f)
                curveTo(12.56f, 21.73f, 12.03f, 22.0f, 11.5f, 22.0f)
                curveTo(10.97f, 22.0f, 10.44f, 21.73f, 10.04f, 21.19f)
                lineTo(9.02f, 19.84f)
                curveTo(8.31f, 18.89f, 7.06f, 18.82f, 6.24f, 19.69f)
                lineTo(6.23f, 19.7f)
                curveTo(5.1f, 20.91f, 4.1f, 21.09f, 3.52f, 20.37f)
                curveTo(3.51f, 20.36f, 3.5f, 20.34f, 3.5f, 20.33f)
                curveTo(3.14f, 19.56f, 3.0f, 18.48f, 3.0f, 16.96f)
                verticalLineTo(7.04f)
                curveTo(3.0f, 5.52f, 3.14f, 4.44f, 3.5f, 3.67f)
                curveTo(3.5f, 3.66f, 3.5f, 3.65f, 3.52f, 3.64f)
                curveTo(4.09f, 2.91f, 5.1f, 3.09f, 6.23f, 4.3f)
                lineTo(6.24f, 4.31f)
                curveTo(7.06f, 5.18f, 8.31f, 5.11f, 9.02f, 4.16f)
                lineTo(10.04f, 2.81f)
                curveTo(10.44f, 2.27f, 10.97f, 2.0f, 11.5f, 2.0f)
                curveTo(12.03f, 2.0f, 12.56f, 2.27f, 12.96f, 2.81f)
                lineTo(13.97f, 4.15f)
                curveTo(14.69f, 5.11f, 15.95f, 5.18f, 16.77f, 4.3f)
                curveTo(17.46f, 3.56f, 18.1f, 3.21f, 18.63f, 3.21f)
                curveTo(18.97f, 3.21f, 19.26f, 3.36f, 19.48f, 3.64f)
                curveTo(19.5f, 3.65f, 19.5f, 3.66f, 19.5f, 3.67f)
                curveTo(19.86f, 4.44f, 20.0f, 5.52f, 20.0f, 7.04f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 10.25f)
                horizontalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 13.75f)
                horizontalLineTo(14.0f)
            }
        }
        .build()
        return _receipt21!!
    }

private var _receipt21: ImageVector? = null
