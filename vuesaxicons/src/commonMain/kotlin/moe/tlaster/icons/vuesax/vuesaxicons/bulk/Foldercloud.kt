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

public val BulkGroup.Foldercloud: ImageVector
    get() {
        if (_foldercloud != null) {
            return _foldercloud!!
        }
        _foldercloud = Builder(name = "Foldercloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9902f, 10.84f)
                curveTo(21.9702f, 10.36f, 21.8902f, 9.89f, 21.7402f, 9.44f)
                curveTo(21.0502f, 7.28f, 19.0303f, 5.72f, 16.6503f, 5.72f)
                horizontalLineTo(13.8602f)
                curveTo(13.2802f, 5.72f, 13.2402f, 5.66f, 12.9302f, 5.25f)
                lineTo(11.5303f, 3.39f)
                curveTo(10.8803f, 2.52f, 10.3702f, 1.99f, 8.7402f, 1.99f)
                horizontalLineTo(6.4102f)
                curveTo(3.9702f, 1.99f, 1.9902f, 3.97f, 1.9902f, 6.41f)
                verticalLineTo(9.43f)
                verticalLineTo(16.64f)
                curveTo(1.9902f, 19.59f, 4.3903f, 21.99f, 7.3403f, 21.99f)
                horizontalLineTo(16.6403f)
                curveTo(19.5903f, 21.99f, 21.9902f, 19.59f, 21.9902f, 16.64f)
                verticalLineTo(11.06f)
                curveTo(22.0002f, 11.0f, 22.0002f, 10.91f, 21.9902f, 10.84f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5805f, 19.7f)
                curveTo(13.4705f, 19.85f, 13.4705f, 22.91f, 15.5805f, 23.06f)
                horizontalLineTo(20.5906f)
                curveTo(21.2006f, 23.06f, 21.7805f, 22.84f, 22.2305f, 22.43f)
                curveTo(23.7105f, 21.14f, 22.9205f, 18.54f, 20.9705f, 18.3f)
                curveTo(20.2705f, 14.08f, 14.1605f, 15.68f, 15.6105f, 19.7f)
            }
        }
        .build()
        return _foldercloud!!
    }

private var _foldercloud: ImageVector? = null
