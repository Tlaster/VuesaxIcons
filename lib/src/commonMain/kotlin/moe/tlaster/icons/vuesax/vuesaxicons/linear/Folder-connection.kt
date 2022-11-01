package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Folder-connection`: ImageVector
    get() {
        if (`_folder-connection` != null) {
            return `_folder-connection`!!
        }
        `_folder-connection` = Builder(name = "Folder-connection", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                verticalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                curveTo(13.1046f, 23.0f, 14.0f, 22.1046f, 14.0f, 21.0f)
                curveTo(14.0f, 19.8954f, 13.1046f, 19.0f, 12.0f, 19.0f)
                curveTo(10.8954f, 19.0f, 10.0f, 19.8954f, 10.0f, 21.0f)
                curveTo(10.0f, 22.1046f, 10.8954f, 23.0f, 12.0f, 23.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 21.0f)
                horizontalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 21.0f)
                horizontalLineTo(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 8.3f)
                verticalLineTo(12.5f)
                curveTo(19.0f, 15.3f, 18.3f, 16.0f, 15.5f, 16.0f)
                horizontalLineTo(8.5f)
                curveTo(5.7f, 16.0f, 5.0f, 15.3f, 5.0f, 12.5f)
                verticalLineTo(5.5f)
                curveTo(5.0f, 2.7f, 5.7f, 2.0f, 8.5f, 2.0f)
                horizontalLineTo(9.55f)
                curveTo(10.6f, 2.0f, 10.83f, 2.31f, 11.23f, 2.84f)
                lineTo(12.28f, 4.24f)
                curveTo(12.55f, 4.59f, 12.7f, 4.8f, 13.4f, 4.8f)
                horizontalLineTo(15.5f)
                curveTo(18.3f, 4.8f, 19.0f, 5.5001f, 19.0f, 8.3f)
                close()
            }
        }
        .build()
        return `_folder-connection`!!
    }

private var `_folder-connection`: ImageVector? = null
