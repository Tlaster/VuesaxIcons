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

public val BulkGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(11.43f, 18.1798f)
                curveTo(9.13f, 18.1798f, 7.25f, 16.2998f, 7.25f, 13.9998f)
                verticalLineTo(10.5698f)
                curveTo(7.25f, 7.9498f, 9.38f, 5.8198f, 12.0f, 5.8198f)
                curveTo(14.62f, 5.8198f, 16.75f, 7.9498f, 16.75f, 10.5698f)
                verticalLineTo(13.7098f)
                curveTo(16.75f, 15.2298f, 15.52f, 16.4598f, 14.0f, 16.4598f)
                curveTo(12.48f, 16.4598f, 11.25f, 15.2298f, 11.25f, 13.7098f)
                verticalLineTo(11.7098f)
                curveTo(11.25f, 11.2998f, 11.59f, 10.9598f, 12.0f, 10.9598f)
                curveTo(12.41f, 10.9598f, 12.75f, 11.2998f, 12.75f, 11.7098f)
                verticalLineTo(13.7098f)
                curveTo(12.75f, 14.3998f, 13.31f, 14.9598f, 14.0f, 14.9598f)
                curveTo(14.69f, 14.9598f, 15.25f, 14.3998f, 15.25f, 13.7098f)
                verticalLineTo(10.5698f)
                curveTo(15.25f, 8.7798f, 13.79f, 7.3198f, 12.0f, 7.3198f)
                curveTo(10.21f, 7.3198f, 8.75f, 8.7798f, 8.75f, 10.5698f)
                verticalLineTo(13.9998f)
                curveTo(8.75f, 15.4798f, 9.95f, 16.6798f, 11.43f, 16.6798f)
                curveTo(11.84f, 16.6798f, 12.18f, 17.0198f, 12.18f, 17.4298f)
                curveTo(12.18f, 17.8398f, 11.84f, 18.1798f, 11.43f, 18.1798f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
