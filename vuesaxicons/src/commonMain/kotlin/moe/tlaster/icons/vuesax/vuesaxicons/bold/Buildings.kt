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

public val BoldGroup.Buildings: ImageVector
    get() {
        if (_buildings != null) {
            return _buildings!!
        }
        _buildings = Builder(name = "Buildings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                curveTo(3.34f, 8.0f, 2.0f, 9.34f, 2.0f, 11.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.66f, 3.34f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(7.6f, 22.0f, 8.5f, 21.1f, 8.5f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(8.5f, 8.9f, 7.6f, 8.0f, 6.5f, 8.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(6.0f, 17.0f)
                curveTo(6.0f, 17.41f, 5.66f, 17.75f, 5.25f, 17.75f)
                curveTo(4.84f, 17.75f, 4.5f, 17.41f, 4.5f, 17.0f)
                verticalLineTo(13.0f)
                curveTo(4.5f, 12.59f, 4.84f, 12.25f, 5.25f, 12.25f)
                curveTo(5.66f, 12.25f, 6.0f, 12.59f, 6.0f, 13.0f)
                verticalLineTo(17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(11.34f, 2.0f, 10.0f, 3.34f, 10.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(10.0f, 20.66f, 11.34f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(13.5f)
                curveTo(13.78f, 22.0f, 14.0f, 21.78f, 14.0f, 21.5f)
                verticalLineTo(18.0f)
                curveTo(14.0f, 17.45f, 14.45f, 17.0f, 15.0f, 17.0f)
                horizontalLineTo(17.0f)
                curveTo(17.55f, 17.0f, 18.0f, 17.45f, 18.0f, 18.0f)
                verticalLineTo(21.5f)
                curveTo(18.0f, 21.78f, 18.22f, 22.0f, 18.5f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(20.66f, 22.0f, 22.0f, 20.66f, 22.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.34f, 20.66f, 2.0f, 19.0f, 2.0f)
                close()
                moveTo(14.75f, 13.0f)
                curveTo(14.75f, 13.41f, 14.41f, 13.75f, 14.0f, 13.75f)
                curveTo(13.59f, 13.75f, 13.25f, 13.41f, 13.25f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(13.25f, 7.59f, 13.59f, 7.25f, 14.0f, 7.25f)
                curveTo(14.41f, 7.25f, 14.75f, 7.59f, 14.75f, 8.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(18.75f, 13.0f)
                curveTo(18.75f, 13.41f, 18.41f, 13.75f, 18.0f, 13.75f)
                curveTo(17.59f, 13.75f, 17.25f, 13.41f, 17.25f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(17.25f, 7.59f, 17.59f, 7.25f, 18.0f, 7.25f)
                curveTo(18.41f, 7.25f, 18.75f, 7.59f, 18.75f, 8.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _buildings!!
    }

private var _buildings: ImageVector? = null
