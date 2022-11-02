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

public val BulkGroup.Messagetext1: ImageVector
    get() {
        if (_messagetext1 != null) {
            return _messagetext1!!
        }
        _messagetext1 = Builder(name = "Messagetext1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.97f)
                verticalLineTo(6.99f)
                curveTo(2.0f, 4.23f, 4.24f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(19.76f, 2.0f, 22.0f, 4.23f, 22.0f, 6.99f)
                verticalLineTo(13.97f)
                curveTo(22.0f, 16.72f, 19.76f, 18.95f, 17.0f, 18.95f)
                horizontalLineTo(15.5f)
                curveTo(15.19f, 18.95f, 14.89f, 19.1f, 14.7f, 19.35f)
                lineTo(13.2f, 21.34f)
                curveTo(12.54f, 22.22f, 11.46f, 22.22f, 10.8f, 21.34f)
                lineTo(9.3f, 19.35f)
                curveTo(9.14f, 19.13f, 8.78f, 18.95f, 8.5f, 18.95f)
                horizontalLineTo(7.0f)
                curveTo(4.24f, 18.95f, 2.0f, 16.72f, 2.0f, 13.97f)
                verticalLineTo(12.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.75f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 8.75f, 6.25f, 8.41f, 6.25f, 8.0f)
                curveTo(6.25f, 7.59f, 6.59f, 7.25f, 7.0f, 7.25f)
                horizontalLineTo(17.0f)
                curveTo(17.41f, 7.25f, 17.75f, 7.59f, 17.75f, 8.0f)
                curveTo(17.75f, 8.41f, 17.41f, 8.75f, 17.0f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.75f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 13.75f, 6.25f, 13.41f, 6.25f, 13.0f)
                curveTo(6.25f, 12.59f, 6.59f, 12.25f, 7.0f, 12.25f)
                horizontalLineTo(13.0f)
                curveTo(13.41f, 12.25f, 13.75f, 12.59f, 13.75f, 13.0f)
                curveTo(13.75f, 13.41f, 13.41f, 13.75f, 13.0f, 13.75f)
                close()
            }
        }
        .build()
        return _messagetext1!!
    }

private var _messagetext1: ImageVector? = null
