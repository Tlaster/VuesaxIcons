package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.03f, 21.69f)
                lineTo(11.36f, 19.73f)
                curveTo(11.71f, 19.43f, 12.29f, 19.43f, 12.64f, 19.73f)
                lineTo(14.97f, 21.69f)
                curveTo(15.51f, 21.96f, 16.17f, 21.69f, 16.37f, 21.11f)
                lineTo(16.81f, 19.78f)
                curveTo(16.92f, 19.46f, 16.81f, 18.99f, 16.57f, 18.75f)
                lineTo(14.3f, 16.47f)
                curveTo(14.13f, 16.31f, 14.0f, 15.99f, 14.0f, 15.76f)
                verticalLineTo(12.91f)
                curveTo(14.0f, 12.49f, 14.31f, 12.29f, 14.7f, 12.45f)
                lineTo(19.61f, 14.57f)
                curveTo(20.38f, 14.9f, 21.01f, 14.49f, 21.01f, 13.65f)
                verticalLineTo(12.36f)
                curveTo(21.01f, 11.69f, 20.51f, 10.92f, 19.89f, 10.66f)
                lineTo(14.3f, 8.25f)
                curveTo(14.14f, 8.18f, 14.0f, 7.97f, 14.0f, 7.79f)
                verticalLineTo(4.79f)
                curveTo(14.0f, 3.85f, 13.31f, 2.74f, 12.47f, 2.31f)
                curveTo(12.17f, 2.16f, 11.82f, 2.16f, 11.52f, 2.31f)
                curveTo(10.68f, 2.74f, 9.99f, 3.86f, 9.99f, 4.8f)
                verticalLineTo(7.8f)
                curveTo(9.99f, 7.98f, 9.85f, 8.19f, 9.69f, 8.26f)
                lineTo(4.11f, 10.67f)
                curveTo(3.49f, 10.92f, 2.99f, 11.69f, 2.99f, 12.36f)
                verticalLineTo(13.65f)
                curveTo(2.99f, 14.49f, 3.62f, 14.9f, 4.39f, 14.57f)
                lineTo(9.3f, 12.45f)
                curveTo(9.68f, 12.28f, 10.0f, 12.49f, 10.0f, 12.91f)
                verticalLineTo(15.76f)
                curveTo(10.0f, 15.99f, 9.87f, 16.31f, 9.71f, 16.47f)
                lineTo(7.44f, 18.75f)
                curveTo(7.2f, 18.99f, 7.09f, 19.45f, 7.2f, 19.78f)
                lineTo(7.64f, 21.11f)
                curveTo(7.82f, 21.69f, 8.48f, 21.97f, 9.03f, 21.69f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
