package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Story: ImageVector
    get() {
        if (_story != null) {
            return _story!!
        }
        _story = Builder(name = "Story", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.42f, 7.95f)
                curveTo(18.86f, 10.39f, 18.86f, 14.35f, 16.42f, 16.79f)
                curveTo(13.98f, 19.23f, 10.02f, 19.23f, 7.58f, 16.79f)
                curveTo(5.14f, 14.35f, 5.14f, 10.39f, 7.58f, 7.95f)
                curveTo(10.02f, 5.51f, 13.98f, 5.51f, 16.42f, 7.95f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.25f, 21.64f)
                curveTo(6.25f, 20.84f, 4.5f, 19.39f, 3.34f, 17.38f)
                curveTo(2.2f, 15.41f, 1.82f, 13.22f, 2.09f, 11.13f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.85f, 4.48f)
                curveTo(7.55f, 3.15f, 9.68f, 2.36f, 12.0f, 2.36f)
                curveTo(14.27f, 2.36f, 16.36f, 3.13f, 18.04f, 4.41f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 21.64f)
                curveTo(17.75f, 20.84f, 19.5f, 19.39f, 20.66f, 17.38f)
                curveTo(21.8f, 15.41f, 22.18f, 13.22f, 21.91f, 11.13f)
            }
        }
        .build()
        return _story!!
    }

private var _story: ImageVector? = null
