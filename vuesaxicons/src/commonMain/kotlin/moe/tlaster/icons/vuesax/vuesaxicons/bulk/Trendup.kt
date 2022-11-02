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

public val BulkGroup.Trendup: ImageVector
    get() {
        if (_trendup != null) {
            return _trendup!!
        }
        _trendup = Builder(name = "Trendup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(16.8295f, 9.41f)
                curveTo(16.7595f, 9.24f, 16.6195f, 9.1f, 16.4495f, 9.03f)
                curveTo(16.3695f, 9.0f, 16.2795f, 8.98f, 16.1895f, 8.98f)
                horizontalLineTo(14.3295f)
                curveTo(13.9395f, 8.98f, 13.6295f, 9.29f, 13.6295f, 9.68f)
                curveTo(13.6295f, 10.07f, 13.9395f, 10.38f, 14.3295f, 10.38f)
                horizontalLineTo(14.5095f)
                lineTo(12.3995f, 12.49f)
                lineTo(11.3795f, 10.97f)
                curveTo(11.2595f, 10.8f, 11.0795f, 10.68f, 10.8695f, 10.66f)
                curveTo(10.6495f, 10.64f, 10.4595f, 10.71f, 10.3095f, 10.86f)
                lineTo(7.3295f, 13.84f)
                curveTo(7.0595f, 14.11f, 7.0595f, 14.55f, 7.3295f, 14.83f)
                curveTo(7.4694f, 14.97f, 7.6395f, 15.03f, 7.8194f, 15.03f)
                curveTo(7.9995f, 15.03f, 8.1795f, 14.96f, 8.3095f, 14.83f)
                lineTo(10.6895f, 12.45f)
                lineTo(11.7095f, 13.97f)
                curveTo(11.8295f, 14.14f, 12.0095f, 14.26f, 12.2195f, 14.28f)
                curveTo(12.4395f, 14.3f, 12.6295f, 14.23f, 12.7795f, 14.08f)
                lineTo(15.4995f, 11.36f)
                verticalLineTo(11.54f)
                curveTo(15.4995f, 11.93f, 15.8095f, 12.24f, 16.1995f, 12.24f)
                curveTo(16.5895f, 12.24f, 16.8995f, 11.93f, 16.8995f, 11.54f)
                verticalLineTo(9.67f)
                curveTo(16.8795f, 9.58f, 16.8695f, 9.49f, 16.8295f, 9.41f)
                close()
            }
        }
        .build()
        return _trendup!!
    }

private var _trendup: ImageVector? = null
