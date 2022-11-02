package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Emojihappy: ImageVector
    get() {
        if (_emojihappy != null) {
            return _emojihappy!!
        }
        _emojihappy = Builder(name = "Emojihappy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.96f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 9.75f)
                curveTo(16.3284f, 9.75f, 17.0f, 9.0784f, 17.0f, 8.25f)
                curveTo(17.0f, 7.4216f, 16.3284f, 6.75f, 15.5f, 6.75f)
                curveTo(14.6716f, 6.75f, 14.0f, 7.4216f, 14.0f, 8.25f)
                curveTo(14.0f, 9.0784f, 14.6716f, 9.75f, 15.5f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 9.75f)
                curveTo(9.3284f, 9.75f, 10.0f, 9.0784f, 10.0f, 8.25f)
                curveTo(10.0f, 7.4216f, 9.3284f, 6.75f, 8.5f, 6.75f)
                curveTo(7.6716f, 6.75f, 7.0f, 7.4216f, 7.0f, 8.25f)
                curveTo(7.0f, 9.0784f, 7.6716f, 9.75f, 8.5f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.4f, 13.3f)
                horizontalLineTo(15.6f)
                curveTo(16.1f, 13.3f, 16.5f, 13.7f, 16.5f, 14.2f)
                curveTo(16.5f, 16.69f, 14.49f, 18.7f, 12.0f, 18.7f)
                curveTo(9.51f, 18.7f, 7.5f, 16.69f, 7.5f, 14.2f)
                curveTo(7.5f, 13.7f, 7.9f, 13.3f, 8.4f, 13.3f)
                close()
            }
        }
        .build()
        return _emojihappy!!
    }

private var _emojihappy: ImageVector? = null
