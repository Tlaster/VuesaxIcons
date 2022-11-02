package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Strongbox: ImageVector
    get() {
        if (_strongbox != null) {
            return _strongbox!!
        }
        _strongbox = Builder(name = "Strongbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 12.5802f)
                verticalLineTo(14.5602f)
                curveTo(13.25f, 15.2502f, 12.69f, 15.8102f, 12.0f, 15.8102f)
                curveTo(11.31f, 15.8102f, 10.75f, 15.2502f, 10.75f, 14.5602f)
                verticalLineTo(12.5802f)
                curveTo(10.39f, 12.3602f, 10.11f, 12.0402f, 9.91f, 11.6602f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 11.6602f, 2.0f, 12.1102f, 2.0f, 12.6602f)
                verticalLineTo(16.1902f)
                curveTo(2.0f, 19.4002f, 4.6f, 22.0002f, 7.81f, 22.0002f)
                horizontalLineTo(16.18f)
                curveTo(19.4f, 22.0002f, 22.0f, 19.4002f, 22.0f, 16.1902f)
                verticalLineTo(12.6602f)
                curveTo(22.0f, 12.1102f, 21.55f, 11.6602f, 21.0f, 11.6602f)
                horizontalLineTo(14.09f)
                curveTo(13.89f, 12.0402f, 13.61f, 12.3602f, 13.25f, 12.5802f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.6f, 2.0f, 2.0f, 4.6f, 2.0f, 7.81f)
                verticalLineTo(9.16f)
                curveTo(2.0f, 9.71f, 2.45f, 10.16f, 3.0f, 10.16f)
                horizontalLineTo(9.67f)
                curveTo(9.9f, 8.84f, 11.21f, 7.9f, 12.64f, 8.28f)
                curveTo(13.44f, 8.49f, 14.09f, 9.14f, 14.3f, 9.94f)
                curveTo(14.32f, 10.01f, 14.32f, 10.09f, 14.33f, 10.16f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 10.16f, 22.0f, 9.71f, 22.0f, 9.16f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.6f, 19.4f, 2.0f, 16.19f, 2.0f)
                close()
            }
        }
        .build()
        return _strongbox!!
    }

private var _strongbox: ImageVector? = null
