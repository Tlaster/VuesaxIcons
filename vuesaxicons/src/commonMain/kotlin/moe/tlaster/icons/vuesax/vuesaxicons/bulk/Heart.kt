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

public val BulkGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.6901f)
                curveTo(22.0f, 9.8801f, 21.81f, 10.9801f, 21.48f, 12.0001f)
                horizontalLineTo(2.52f)
                curveTo(2.19f, 10.9801f, 2.0f, 9.8801f, 2.0f, 8.6901f)
                curveTo(2.0f, 5.6001f, 4.49f, 3.1001f, 7.56f, 3.1001f)
                curveTo(9.37f, 3.1001f, 10.99f, 3.9801f, 12.0f, 5.3301f)
                curveTo(13.01f, 3.9801f, 14.63f, 3.1001f, 16.44f, 3.1001f)
                curveTo(19.51f, 3.1001f, 22.0f, 5.6001f, 22.0f, 8.6901f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.4795f, 12.0f)
                curveTo(19.8995f, 17.0f, 15.0295f, 19.99f, 12.6195f, 20.81f)
                curveTo(12.2795f, 20.93f, 11.7195f, 20.93f, 11.3795f, 20.81f)
                curveTo(8.9695f, 19.99f, 4.0995f, 17.0f, 2.5195f, 12.0f)
                horizontalLineTo(21.4795f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
