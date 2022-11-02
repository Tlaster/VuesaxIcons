package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Maximize: ImageVector
    get() {
        if (_maximize != null) {
            return _maximize!!
        }
        _maximize = Builder(name = "Maximize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.25f)
                curveTo(17.59f, 9.25f, 17.25f, 9.59f, 17.25f, 10.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(6.75f)
                horizontalLineTo(14.0f)
                curveTo(14.41f, 6.75f, 14.75f, 6.41f, 14.75f, 6.0f)
                curveTo(14.75f, 5.59f, 14.41f, 5.25f, 14.0f, 5.25f)
                horizontalLineTo(10.0f)
                curveTo(9.59f, 5.25f, 9.25f, 5.59f, 9.25f, 6.0f)
                curveTo(9.25f, 6.41f, 9.59f, 6.75f, 10.0f, 6.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(11.25f)
                horizontalLineTo(6.75f)
                verticalLineTo(10.0f)
                curveTo(6.75f, 9.59f, 6.41f, 9.25f, 6.0f, 9.25f)
                curveTo(5.59f, 9.25f, 5.25f, 9.59f, 5.25f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(5.25f, 14.41f, 5.59f, 14.75f, 6.0f, 14.75f)
                curveTo(6.41f, 14.75f, 6.75f, 14.41f, 6.75f, 14.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(17.25f)
                horizontalLineTo(10.0f)
                curveTo(9.59f, 17.25f, 9.25f, 17.59f, 9.25f, 18.0f)
                curveTo(9.25f, 18.41f, 9.59f, 18.75f, 10.0f, 18.75f)
                horizontalLineTo(14.0f)
                curveTo(14.41f, 18.75f, 14.75f, 18.41f, 14.75f, 18.0f)
                curveTo(14.75f, 17.59f, 14.41f, 17.25f, 14.0f, 17.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(12.75f)
                horizontalLineTo(17.25f)
                verticalLineTo(14.0f)
                curveTo(17.25f, 14.41f, 17.59f, 14.75f, 18.0f, 14.75f)
                curveTo(18.41f, 14.75f, 18.75f, 14.41f, 18.75f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(18.75f, 9.59f, 18.41f, 9.25f, 18.0f, 9.25f)
                close()
            }
        }
        .build()
        return _maximize!!
    }

private var _maximize: ImageVector? = null
