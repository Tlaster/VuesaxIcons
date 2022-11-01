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

public val LinearGroup.`Filter-square`: ImageVector
    get() {
        if (`_filter-square` != null) {
            return `_filter-square`!!
        }
        `_filter-square` = Builder(name = "Filter-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.16f, 6.65f)
                horizontalLineTo(15.83f)
                curveTo(16.47f, 6.65f, 16.99f, 7.17f, 16.99f, 7.81f)
                verticalLineTo(9.09f)
                curveTo(16.99f, 9.56f, 16.7f, 10.14f, 16.41f, 10.43f)
                lineTo(13.91f, 12.64f)
                curveTo(13.56f, 12.93f, 13.33f, 13.51f, 13.33f, 13.98f)
                verticalLineTo(16.48f)
                curveTo(13.33f, 16.83f, 13.1f, 17.29f, 12.81f, 17.47f)
                lineTo(12.0f, 17.98f)
                curveTo(11.24f, 18.45f, 10.2f, 17.92f, 10.2f, 16.99f)
                verticalLineTo(13.91f)
                curveTo(10.2f, 13.5f, 9.97f, 12.98f, 9.73f, 12.69f)
                lineTo(7.52f, 10.36f)
                curveTo(7.23f, 10.08f, 7.0f, 9.55f, 7.0f, 9.2f)
                verticalLineTo(7.87f)
                curveTo(7.0f, 7.17f, 7.52f, 6.65f, 8.16f, 6.65f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
        }
        .build()
        return `_filter-square`!!
    }

private var `_filter-square`: ImageVector? = null
