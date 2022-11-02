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

public val BulkGroup.Message2: ImageVector
    get() {
        if (_message2 != null) {
            return _message2!!
        }
        _message2 = Builder(name = "Message2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 18.4302f)
                horizontalLineTo(11.0f)
                lineTo(15.45f, 21.3902f)
                curveTo(16.11f, 21.8302f, 17.0f, 21.3602f, 17.0f, 20.5602f)
                verticalLineTo(18.4302f)
                curveTo(20.0f, 18.4302f, 22.0f, 16.4302f, 22.0f, 13.4302f)
                verticalLineTo(7.4302f)
                curveTo(22.0f, 4.4302f, 20.0f, 2.4302f, 17.0f, 2.4302f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 2.4302f, 2.0f, 4.4302f, 2.0f, 7.4302f)
                verticalLineTo(13.4302f)
                curveTo(2.0f, 16.4302f, 4.0f, 18.4302f, 7.0f, 18.4302f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 11.25f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 11.25f, 7.75f, 10.91f, 7.75f, 10.5f)
                curveTo(7.75f, 10.09f, 8.09f, 9.75f, 8.5f, 9.75f)
                horizontalLineTo(15.5f)
                curveTo(15.91f, 9.75f, 16.25f, 10.09f, 16.25f, 10.5f)
                curveTo(16.25f, 10.91f, 15.91f, 11.25f, 15.5f, 11.25f)
                close()
            }
        }
        .build()
        return _message2!!
    }

private var _message2: ImageVector? = null
